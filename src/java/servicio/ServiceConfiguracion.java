package servicio;

import dto.ConfiguracionDTO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
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
        Configuracion c = new Configuracion();
        c.setMaxim(configuracion.getMaxim());
        c.setMinim(configuracion.getMinim());
        c.setIntervaloH(configuracion.getIntervaloH());
        c.setIntervaloM(configuracion.getIntervaloM());
        c.setIntervaloS(configuracion.getIntervaloS());
        c.setIdTermometro(configuracion.getIdTermometro());
        em.persist(c);
        
    }
    
}
