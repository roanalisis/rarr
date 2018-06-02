/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author rodrigorr
 */
public class TermometroDTO implements Serializable{
    @Id
    @Basic(optional = false)
    @NotNull(message = "El identificador del termómetro no debe estar vacío.")
    @Size(min = 1, max = 50, message = "El largo del identificador debe ir de 1 a 50.")
    private String idTerm;
    @Size(max = 50, message = "El largo del campo debe ser hasta 50.")
    private String clase;
    @Size(max = 50, message = "El largo del campo debe ser hasta 50.")
    private String nombre;
    @NotNull(message = "La dirección IP no debe estar vacía.")
    @Size(min = 1, max = 15, message = "El largo del campo debe ser hasta 15.")
    private String dirip;
    @Min(1)
    @Max(999999)
    private int dirpuerto;

    public TermometroDTO() {
    }

    public TermometroDTO(String idTerm, String clase, String nombre, String dirIp, int dirPuerto) {
        this.idTerm = idTerm;
        this.clase = clase;
        this.nombre = nombre;
        this.dirip = dirIp;
        this.dirpuerto = dirPuerto;
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
    
    
   
    
}
