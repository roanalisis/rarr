package servicio;

import dto.ConfiguracionDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Service;
import persistencia.Configuracion;
import persistencia.Termometro;

/**
 *
 * @author rodrigorr
 */
@Service
public class ServiceConfiguracion {
    @PersistenceContext
    private EntityManager em;
    
    @Transactional(rollbackOn = {ServiceException.class})
    public void agregarConfiguracion(ConfiguracionDTO configuracion) throws ServiceException{
        try{
        Configuracion c = new Configuracion();
        c.setMaxim(configuracion.getMaxim());
        c.setMinim(configuracion.getMinim());
        c.setIntervaloh(configuracion.getIntervaloh());
        c.setIntervalom(configuracion.getIntervalom());
        c.setIntervalos(configuracion.getIntervalos());
        //c.setIdTermometro(configuracion.getIdTermometro());
        c.setIdtermometro(new Termometro(configuracion.getIdtermometro()));
        em.persist(c);
        }catch(Exception e){
                
                System.out.println("¨¨");
                System.out.println("¨¨");
                System.out.println("¨¨");
                System.out.println("¨¨");
                System.out.println("¨¨");
                System.out.println("¨¨ "+ e.getMessage());
                System.out.println("¨¨ "+ e.toString());
                System.out.println("¨¨");
                System.out.println("¨¨");
                System.out.println("¨¨");
                System.out.println("¨¨");
                System.out.println("¨¨");
        }
        
    }
    
}
