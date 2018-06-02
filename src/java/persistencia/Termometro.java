/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rodrigorr
 */
@Entity
@Table(name = "termometro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Termometro.findAll", query = "SELECT t FROM Termometro t")
    , @NamedQuery(name = "Termometro.findByIdTerm", query = "SELECT t FROM Termometro t WHERE t.idTerm = :idTerm")
    , @NamedQuery(name = "Termometro.findByClase", query = "SELECT t FROM Termometro t WHERE t.clase = :clase")
    , @NamedQuery(name = "Termometro.findByNombre", query = "SELECT t FROM Termometro t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Termometro.findByDirip", query = "SELECT t FROM Termometro t WHERE t.dirip = :dirip")
    , @NamedQuery(name = "Termometro.findByDirpuerto", query = "SELECT t FROM Termometro t WHERE t.dirpuerto = :dirpuerto")})
public class Termometro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id_term")
    private String idTerm;
    @Size(max = 50)
    @Column(name = "clase")
    private String clase;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "dirip")
    private String dirip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dirpuerto")
    private int dirpuerto;
    @OneToMany(mappedBy = "idTermometro")
    private List<Configuracion> configuracionList;
    @OneToMany(mappedBy = "idTermometro")
    private List<Notificacion> notificacionList;
    @OneToMany(mappedBy = "idTermometro")
    private List<Registrotemp> registrotempList;

    public Termometro() {
    }

    public Termometro(String idTerm) {
        this.idTerm = idTerm;
    }

    public Termometro(String idTerm, String dirip, int dirpuerto) {
        this.idTerm = idTerm;
        this.dirip = dirip;
        this.dirpuerto = dirpuerto;
    }

    public String getIdTerm() {
        return idTerm;
    }

    public void setIdTerm(String idTerm) {
        this.idTerm = idTerm;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirip() {
        return dirip;
    }

    public void setDirip(String dirip) {
        this.dirip = dirip;
    }

    public int getDirpuerto() {
        return dirpuerto;
    }

    public void setDirpuerto(int dirpuerto) {
        this.dirpuerto = dirpuerto;
    }

    @XmlTransient
    public List<Configuracion> getConfiguracionList() {
        return configuracionList;
    }

    public void setConfiguracionList(List<Configuracion> configuracionList) {
        this.configuracionList = configuracionList;
    }

    @XmlTransient
    public List<Notificacion> getNotificacionList() {
        return notificacionList;
    }

    public void setNotificacionList(List<Notificacion> notificacionList) {
        this.notificacionList = notificacionList;
    }

    @XmlTransient
    public List<Registrotemp> getRegistrotempList() {
        return registrotempList;
    }

    public void setRegistrotempList(List<Registrotemp> registrotempList) {
        this.registrotempList = registrotempList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTerm != null ? idTerm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Termometro)) {
            return false;
        }
        Termometro other = (Termometro) object;
        if ((this.idTerm == null && other.idTerm != null) || (this.idTerm != null && !this.idTerm.equals(other.idTerm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Termometro[ idTerm=" + idTerm + " ]";
    }
    
}
