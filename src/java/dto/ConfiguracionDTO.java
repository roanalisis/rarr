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
    private Float maxim; //temperatura máxima
    private Float minim; //temperatura máxima
    private Integer intervaloH;
    private Integer intervaloM;
    private Integer intervaloS;
    private Termometro idTermometro;

    public ConfiguracionDTO() {
    }

    public ConfiguracionDTO(Integer idConf, Date tmestamp, Float maxim, Float minim, Integer intervaloH, Integer intervaloM, Integer intervaloS, Termometro idTermometro) {
        this.idConf = idConf;
        this.tmestamp = tmestamp;
        this.maxim = maxim;
        this.minim = minim;
        this.intervaloH = intervaloH;
        this.intervaloM = intervaloM;
        this.intervaloS = intervaloS;
        this.idTermometro = idTermometro;
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

    
    
    
    
}
