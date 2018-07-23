/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author rodrigorr
 */
public class ConfiguradorDTO {
    @Size(min = 10, max = 50, message = "El largo del campo debe estar entre 10 y 50")
    private String nombreusuario;
    @Size(min = 10, max = 50, message = "El largo del campo debe estar entre 10 y 50")
    private String nombre;
    //@Email(message="Por favor, ingrese una dirección de correo válida.")
    @Pattern(regexp=".+@.+\\..+", message="Por favor, ingrese una dirección de correo válida.")
    private String mail;
    @Size(min = 10, max = 50, message = "El largo del campo debe estar entre 10 y 50")
    private String password;

    public ConfiguradorDTO() {
    }

    public ConfiguradorDTO(String nombreusuario, String nombre, String mail, String password) {
        this.nombreusuario = nombreusuario;
        this.nombre = nombre;
        this.mail = mail;
        this.password = password;
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
    
    
   
}
