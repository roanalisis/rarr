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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rodrigorr
 */
@Entity
@Table(name = "testconnection")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Testconnection.findAll", query = "SELECT t FROM Testconnection t")
    , @NamedQuery(name = "Testconnection.findByIdconnection", query = "SELECT t FROM Testconnection t WHERE t.idconnection = :idconnection")
    , @NamedQuery(name = "Testconnection.findByTexto", query = "SELECT t FROM Testconnection t WHERE t.texto = :texto")})
public class Testconnection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idconnection")
    private Integer idconnection;
    @Size(max = 50)
    @Column(name = "texto")
    private String texto;

    public Testconnection() {
    }

    public Testconnection(Integer idconnection) {
        this.idconnection = idconnection;
    }

    public Integer getIdconnection() {
        return idconnection;
    }

    public void setIdconnection(Integer idconnection) {
        this.idconnection = idconnection;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconnection != null ? idconnection.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Testconnection)) {
            return false;
        }
        Testconnection other = (Testconnection) object;
        if ((this.idconnection == null && other.idconnection != null) || (this.idconnection != null && !this.idconnection.equals(other.idconnection))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "persistencia.Testconnection[ idconnection=" + idconnection + " ]";
    }
    
}
