package persistencia;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Termometro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-29T15:40:52")
@StaticMetamodel(Notificacion.class)
public class Notificacion_ { 

    public static volatile SingularAttribute<Notificacion, Termometro> idTermometro;
    public static volatile SingularAttribute<Notificacion, Date> tmestamp;
    public static volatile SingularAttribute<Notificacion, Float> temperatura;
    public static volatile SingularAttribute<Notificacion, Integer> idNot;

}