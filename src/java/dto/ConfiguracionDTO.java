package dto;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import persistencia.Termometro;

/**
 *
 * @author rodrigorr
 */
public class ConfiguracionDTO implements Serializable{
    private Integer idConf;
    private Date tmestamp;
    private Float maxim;
    private Float minim;
    private Integer intervaloh;
    private Integer intervalom;
    private Integer intervalos;
    @NotNull(message = "El idTermometro no debe estar vacío.")
    private Integer idtermometro;

    public ConfiguracionDTO() {
    }

    public ConfiguracionDTO(Integer idConf, Date tmestamp, Float maxim, Float minim, Integer intervaloh, Integer intervalom, Integer intervalos, Integer idtermometro) {
        this.idConf = idConf;
        this.tmestamp = tmestamp;
        this.maxim = maxim;
        this.minim = minim;
        this.intervaloh = intervaloh;
        this.intervalom = intervalom;
        this.intervalos = intervalos;
        this.idtermometro = idtermometro;
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


    public Integer getIdtermometro() {
        return idtermometro;
    }

    public void setIdtermometro(Integer idtermometro) {
        this.idtermometro = idtermometro;
    }

    

    
    
}
