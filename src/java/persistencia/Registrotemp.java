/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rodrigorr
 */
@Entity
@Table(name = "registrotemp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registrotemp.findAll", query = "SELECT r FROM Registrotemp r")
    , @NamedQuery(name = "Registrotemp.findByIdreg", query = "SELECT r FROM Registrotemp r WHERE r.idreg = :idreg")
    , @NamedQuery(name = "Registrotemp.findByTmestamp", query = "SELECT r FROM Registrotemp r WHERE r.tmestamp = :tmestamp")
    , @NamedQuery(name = "Registrotemp.findByTemperatura", query = "SELECT r FROM Registrotemp r WHERE r.temperatura = :temperatura")})
public class Registrotemp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreg")
    private Integer idreg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tmestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmestamp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "temperatura")
    private Float temperatura;
    @JoinColumn(name = "idtermometro", referencedColumnName = "idterm")
    @ManyToOne(optional = false)
    private Termometro idtermometro;

    public Registrotemp() {
    }

    public Registrotemp(Integer idreg) {
        this.idreg = idreg;
    }

    public Registrotemp(Integer idreg, Date tmestamp) {
        this.idreg = idreg;
        this.tmestamp = tmestamp;
    }

    public Integer getIdreg() {
        return idreg;
    }

    public void setIdreg(Integer idreg) {
        this.idreg = idreg;
    }

    public Date getTmestamp() {
        return tmestamp;
    }

    public void setTmestamp(Date tmestamp) {
        this.tmestamp = tmestamp;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Termometro getIdtermometro() {
        return idtermometro;
    }

    public void setIdtermometro(Termometro idtermometro) {
        this.idtermometro = idtermometro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreg != null ? idreg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registrotemp)) {
            return false;
        }
        Registrotemp other = (Registrotemp) object;
        if ((this.idreg == null && other.idreg != null) || (this.idreg != null && !this.idreg.equals(other.idreg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Registrotemp[ idreg=" + idreg + " ]";
    }
    
}
