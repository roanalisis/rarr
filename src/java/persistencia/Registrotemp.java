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
    , @NamedQuery(name = "Registrotemp.findByIdReg", query = "SELECT r FROM Registrotemp r WHERE r.idReg = :idReg")
    , @NamedQuery(name = "Registrotemp.findByTmestamp", query = "SELECT r FROM Registrotemp r WHERE r.tmestamp = :tmestamp")
    , @NamedQuery(name = "Registrotemp.findByTemperatura", query = "SELECT r FROM Registrotemp r WHERE r.temperatura = :temperatura")})
public class Registrotemp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reg")
    private Integer idReg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tmestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmestamp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "temperatura")
    private Float temperatura;
    @JoinColumn(name = "id_termometro", referencedColumnName = "id_term")
    @ManyToOne
    private Termometro idTermometro;

    public Registrotemp() {
    }

    public Registrotemp(Integer idReg) {
        this.idReg = idReg;
    }

    public Registrotemp(Integer idReg, Date tmestamp) {
        this.idReg = idReg;
        this.tmestamp = tmestamp;
    }

    public Integer getIdReg() {
        return idReg;
    }

    public void setIdReg(Integer idReg) {
        this.idReg = idReg;
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

    public Termometro getIdTermometro() {
        return idTermometro;
    }

    public void setIdTermometro(Termometro idTermometro) {
        this.idTermometro = idTermometro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReg != null ? idReg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registrotemp)) {
            return false;
        }
        Registrotemp other = (Registrotemp) object;
        if ((this.idReg == null && other.idReg != null) || (this.idReg != null && !this.idReg.equals(other.idReg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Registrotemp[ idReg=" + idReg + " ]";
    }
    
}
