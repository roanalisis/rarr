package servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import persistencia.Termometro;

/**
 *
 * @author rodrigorr
 */
@Service
public class ServiceConsultaTermometros {
    @PersistenceContext
    private EntityManager em;
    
    public List<Termometro> listarTermometros(){
        Query q = em.createNamedQuery("Termometro.findAll");
        List<Termometro> termometroList = q.getResultList();   
        return termometroList; 
    }
    
}
