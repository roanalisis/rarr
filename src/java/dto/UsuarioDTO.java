package dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author rodrigorr
 */
public class UsuarioDTO implements Serializable{
    @Size(min = 10, max = 50, message = "El largo del campo debe estar entre 10 y 50")
    private String nombreusuario;
    @Size(min = 10, max = 50, message = "El largo del campo debe estar entre 10 y 50")
    private String nombre;
    //@Email(message="Por favor, ingrese una dirección de correo válida.")
    @Pattern(regexp=".+@.+\\..+", message="Por favor, ingrese una dirección de correo válida.")
    private String mail;
    @Size(min = 10, max = 50, message = "El largo del campo debe estar entre 10 y 50")
    private String passwordU;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nombreusuario, String nombre, String mail, String passwordU) {
        this.nombreusuario = nombreusuario;
        this.nombre = nombre;
        this.mail = mail;
        this.passwordU = passwordU;
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

    public String getPasswordU() {
        return passwordU;
    }

    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }
    
    
    
    
}
