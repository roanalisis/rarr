package persistencia;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Configuracion;
import persistencia.Notificacion;
import persistencia.Registrotemp;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-11T21:31:57")
@StaticMetamodel(Termometro.class)
public class Termometro_ { 

    public static volatile ListAttribute<Termometro, Configuracion> configuracionList;
    public static volatile SingularAttribute<Termometro, Integer> idterm;
    public static volatile SingularAttribute<Termometro, String> dirip;
    public static volatile SingularAttribute<Termometro, Integer> dirpuerto;
    public static volatile SingularAttribute<Termometro, Float> rangomax;
    public static volatile SingularAttribute<Termometro, Float> rangomin;
    public static volatile ListAttribute<Termometro, Notificacion> notificacionList;
    public static volatile SingularAttribute<Termometro, String> nombre;
    public static volatile SingularAttribute<Termometro, String> clase;
    public static volatile ListAttribute<Termometro, Registrotemp> registrotempList;

}