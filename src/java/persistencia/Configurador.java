/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rodrigorr
 */
@Entity
@Table(name = "configurador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Configurador.findAll", query = "SELECT c FROM Configurador c")
    , @NamedQuery(name = "Configurador.findById", query = "SELECT c FROM Configurador c WHERE c.id = :id")
    , @NamedQuery(name = "Configurador.findByNombreusuario", query = "SELECT c FROM Configurador c WHERE c.nombreusuario = :nombreusuario")
    , @NamedQuery(name = "Configurador.findByNombre", query = "SELECT c FROM Configurador c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Configurador.findByMail", query = "SELECT c FROM Configurador c WHERE c.mail = :mail")
    , @NamedQuery(name = "Configurador.findByPassword", query = "SELECT c FROM Configurador c WHERE c.password = :password")
    , @NamedQuery(name = "Configurador.findByUsuarioyPassword", query = "SELECT c FROM Configurador c WHERE c.nombreusuario = :nombreusuario and c.password = :password")})  
public class Configurador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nombreusuario")
    private String nombreusuario;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "mail")
    private String mail;
    @Size(max = 50)
    @Column(name = "password")
    private String password;

    public Configurador() {
    }

    public Configurador(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Configurador)) {
            return false;
        }
        Configurador other = (Configurador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Configurador[ id=" + id + " ]";
    }
    
}
