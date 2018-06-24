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
    , @NamedQuery(name = "Configuracion.findByIdConf", query = "SELECT c FROM Configuracion c WHERE c.idConf = :idConf")
    , @NamedQuery(name = "Configuracion.findByTmestamp", query = "SELECT c FROM Configuracion c WHERE c.tmestamp = :tmestamp")
    , @NamedQuery(name = "Configuracion.findByMaxim", query = "SELECT c FROM Configuracion c WHERE c.maxim = :maxim")
    , @NamedQuery(name = "Configuracion.findByMinim", query = "SELECT c FROM Configuracion c WHERE c.minim = :minim")
    , @NamedQuery(name = "Configuracion.findByIntervaloH", query = "SELECT c FROM Configuracion c WHERE c.intervaloH = :intervaloH")
    , @NamedQuery(name = "Configuracion.findByIntervaloM", query = "SELECT c FROM Configuracion c WHERE c.intervaloM = :intervaloM")
    , @NamedQuery(name = "Configuracion.findByIntervaloS", query = "SELECT c FROM Configuracion c WHERE c.intervaloS = :intervaloS")})
public class Configuracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_conf")
    private Integer idConf;
    @Basic(optional = false)
    @Column(name = "tmestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmestamp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "maxim")
    private Float maxim;
    @Column(name = "minim")
    private Float minim;
    @Column(name = "intervalo_h")
    private Integer intervaloH;
    @Column(name = "intervalo_m")
    private Integer intervaloM;
    @Column(name = "intervalo_s")
    private Integer intervaloS;
    @JoinColumn(name = "id_termometro", referencedColumnName = "id_term")
    @ManyToOne
    private Termometro idTermometro;

    public Configuracion() {
    }

    public Configuracion(Integer idConf) {
        this.idConf = idConf;
    }

    public Configuracion(Integer idConf, Date tmestamp) {
        this.idConf = idConf;
        this.tmestamp = tmestamp;
    }

    public Integer getIdConf() {
        return idConf;
    }

    public void setIdConf(Integer idConf) {
        this.idConf = idConf;
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

    public Integer getIntervaloH() {
        return intervaloH;
    }

    public void setIntervaloH(Integer intervaloH) {
        this.intervaloH = intervaloH;
    }

    public Integer getIntervaloM() {
        return intervaloM;
    }

    public void setIntervaloM(Integer intervaloM) {
        this.intervaloM = intervaloM;
    }

    public Integer getIntervaloS() {
        return intervaloS;
    }

    public void setIntervaloS(Integer intervaloS) {
        this.intervaloS = intervaloS;
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
        hash += (idConf != null ? idConf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Configuracion)) {
            return false;
        }
        Configuracion other = (Configuracion) object;
        if ((this.idConf == null && other.idConf != null) || (this.idConf != null && !this.idConf.equals(other.idConf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Configuracion[ idConf=" + idConf + " ]";
    }
    
}
