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
@Table(name = "configuracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Configuracion.findAll", query = "SELECT c FROM Configuracion c")
    , @NamedQuery(name = "Configuracion.findByIdconf", query = "SELECT c FROM Configuracion c WHERE c.idconf = :idconf")
    , @NamedQuery(name = "Configuracion.findByTmestamp", query = "SELECT c FROM Configuracion c WHERE c.tmestamp = :tmestamp")
    , @NamedQuery(name = "Configuracion.findByMaxim", query = "SELECT c FROM Configuracion c WHERE c.maxim = :maxim")
    , @NamedQuery(name = "Configuracion.findByMinim", query = "SELECT c FROM Configuracion c WHERE c.minim = :minim")
    , @NamedQuery(name = "Configuracion.findByIntervaloh", query = "SELECT c FROM Configuracion c WHERE c.intervaloh = :intervaloh")
    , @NamedQuery(name = "Configuracion.findByIntervalom", query = "SELECT c FROM Configuracion c WHERE c.intervalom = :intervalom")
    , @NamedQuery(name = "Configuracion.findByIntervalos", query = "SELECT c FROM Configuracion c WHERE c.intervalos = :intervalos")})
public class Configuracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconf")
    private Integer idconf;
    @Basic(optional = false)
    //@NotNull
    @Column(name = "tmestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmestamp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "maxim")
    private Float maxim;
    @Column(name = "minim")
    private Float minim;
    @Column(name = "intervaloh")
    private Integer intervaloh;
    @Column(name = "intervalom")
    private Integer intervalom;
    @Column(name = "intervalos")
    private Integer intervalos;
    @JoinColumn(name = "idtermometro", referencedColumnName = "idterm")
    @ManyToOne(optional = false)
    private Termometro idtermometro;

    public Configuracion() {
    }

    public Configuracion(Integer idconf) {
        this.idconf = idconf;
    }

    public Configuracion(Integer idconf, Date tmestamp) {
        this.idconf = idconf;
        this.tmestamp = tmestamp;
    }

    public Integer getIdconf() {
        return idconf;
    }

    public void setIdconf(Integer idconf) {
        this.idconf = idconf;
    }

    public Date getTmestamp() {
        return tmestamp;
    }

    public void setTmestamp(Date tmestamp) {
        this.tmestamp = tmestamp;
    }

    public Float getMaxim() {
        return maxim;
    }

    public void setMaxim(Float maxim) {
        this.maxim = maxim;
    }

    public Float getMinim() {
        return minim;
    }

    public void setMinim(Float minim) {
        this.minim = minim;
    }

    public Integer getIntervaloh() {
        return intervaloh;
    }

    public void setIntervaloh(Integer intervaloh) {
        this.intervaloh = intervaloh;
    }

    public Integer getIntervalom() {
        return intervalom;
    }

    public void setIntervalom(Integer intervalom) {
        this.intervalom = intervalom;
    }

    public Integer getIntervalos() {
        return intervalos;
    }

    public void setIntervalos(Integer intervalos) {
        this.intervalos = intervalos;
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
        hash += (idconf != null ? idconf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Configuracion)) {
            return false;
        }
        Configuracion other = (Configuracion) object;
        if ((this.idconf == null && other.idconf != null) || (this.idconf != null && !this.idconf.equals(other.idconf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Configuracion[ idconf=" + idconf + " ]";
    }
    
}
