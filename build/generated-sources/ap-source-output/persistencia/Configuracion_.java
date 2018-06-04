package persistencia;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Termometro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-04T12:02:05")
@StaticMetamodel(Configuracion.class)
public class Configuracion_ { 

    public static volatile SingularAttribute<Configuracion, Integer> intervaloS;
    public static volatile SingularAttribute<Configuracion, Integer> idConf;
    public static volatile SingularAttribute<Configuracion, Termometro> idTermometro;
    public static volatile SingularAttribute<Configuracion, Date> tmestamp;
    public static volatile SingularAttribute<Configuracion, Float> maxim;
    public static volatile SingularAttribute<Configuracion, Float> minim;
    public static volatile SingularAttribute<Configuracion, Integer> intervaloH;
    public static volatile SingularAttribute<Configuracion, Integer> intervaloM;

}