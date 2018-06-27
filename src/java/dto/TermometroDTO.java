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
    private Integer idTerm;
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

    public TermometroDTO(Integer idTerm, String clase, String nombre, String dirip, int dirpuerto) {
        this.idTerm = idTerm;
        this.clase = clase;
        this.nombre = nombre;
        this.dirip = dirip;
        this.dirpuerto = dirpuerto;
    }

    public Integer getIdTerm() {
        return idTerm;
    }

    public void setIdTerm(Integer idTerm) {
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
