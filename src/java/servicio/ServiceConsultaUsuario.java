package servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.UnexpectedRollbackException;
import persistencia.Usuario;

/**
 *
 * @author rodrigorr
 */
@Service
public class ServiceConsultaUsuario {
    @PersistenceContext
    private EntityManager em;
    //
    public List<Usuario> DenucioByNombreUsuario(String nombreusuario){
        Query q = em.createNamedQuery("Usuario.findByNombreusuario");
        q.setParameter("nombreusuario", nombreusuario);
        List<Usuario> cargoList = q.getResultList(); 
        return cargoList;  

        
    }
    
}
