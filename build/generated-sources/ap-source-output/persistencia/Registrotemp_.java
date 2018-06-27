package persistencia;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import persistencia.Termometro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-27T13:56:08")
@StaticMetamodel(Registrotemp.class)
public class Registrotemp_ { 

    public static volatile SingularAttribute<Registrotemp, Termometro> idtermometro;
    public static volatile SingularAttribute<Registrotemp, Date> tmestamp;
    public static volatile SingularAttribute<Registrotemp, Float> temperatura;
    public static volatile SingularAttribute<Registrotemp, Integer> idreg;

}