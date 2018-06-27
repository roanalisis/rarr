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
@Table(name = "notificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notificacion.findAll", query = "SELECT n FROM Notificacion n")
    , @NamedQuery(name = "Notificacion.findByIdnot", query = "SELECT n FROM Notificacion n WHERE n.idnot = :idnot")
    , @NamedQuery(name = "Notificacion.findByTmestamp", query = "SELECT n FROM Notificacion n WHERE n.tmestamp = :tmestamp")
    , @NamedQuery(name = "Notificacion.findByTemperatura", query = "SELECT n FROM Notificacion n WHERE n.temperatura = :temperatura")})
public class Notificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnot")
    private Integer idnot;
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

    public Notificacion() {
    }

    public Notificacion(Integer idnot) {
        this.idnot = idnot;
    }

    public Notificacion(Integer idnot, Date tmestamp) {
        this.idnot = idnot;
        this.tmestamp = tmestamp;
    }

    public Integer getIdnot() {
        return idnot;
    }

    public void setIdnot(Integer idnot) {
        this.idnot = idnot;
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
        hash += (idnot != null ? idnot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacion)) {
            return false;
        }
        Notificacion other = (Notificacion) object;
        if ((this.idnot == null && other.idnot != null) || (this.idnot != null && !this.idnot.equals(other.idnot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Notificacion[ idnot=" + idnot + " ]";
    }
    
}
