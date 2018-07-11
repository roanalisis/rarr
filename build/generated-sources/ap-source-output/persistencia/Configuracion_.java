package persistencia;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Termometro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-09T17:52:25")
@StaticMetamodel(Configuracion.class)
public class Configuracion_ { 

    public static volatile SingularAttribute<Configuracion, Integer> intervalos;
    public static volatile SingularAttribute<Configuracion, Termometro> idtermometro;
    public static volatile SingularAttribute<Configuracion, Integer> idconf;
    public static volatile SingularAttribute<Configuracion, Date> tmestamp;
    public static volatile SingularAttribute<Configuracion, Float> maxim;
    public static volatile SingularAttribute<Configuracion, Float> minim;
    public static volatile SingularAttribute<Configuracion, Integer> intervaloh;
    public static volatile SingularAttribute<Configuracion, Integer> intervalom;

}