/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;
import persistencia.Termometro;

/**
 *
 * @author rodrigorr
 */
public class RegistrotempDTO implements Serializable{

    private Integer idreg;
    //@NotNull
    private Date tmestamp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Float temperatura;
    private boolean active;
    private Termometro idtermometro;

    public RegistrotempDTO() {
    }

    public RegistrotempDTO(Integer idreg, Date tmestamp, Float temperatura, boolean active, Termometro idtermometro) {
        this.idreg = idreg;
        this.tmestamp = tmestamp;
        this.temperatura = temperatura;
        this.active = active;
        this.idtermometro = idtermometro;
    }

    public Integer getIdreg() {
        return idreg;
    }

    public void setIdreg(Integer idreg) {
        this.idreg = idreg;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Termometro getIdtermometro() {
        return idtermometro;
    }

    public void setIdtermometro(Termometro idtermometro) {
        this.idtermometro = idtermometro;
    }

    
    
    
    
}
