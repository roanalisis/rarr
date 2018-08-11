package servicio;

import dto.UsuarioDTO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import persistencia.Usuario;

/**
 *
 * @author rodrigorr
 */
@Service
public class ServiceUsuario {
    @PersistenceContext
    private EntityManager em;
    
    @Transactional(rollbackOn = {ServiceException.class})
    public void agregarUsuario(UsuarioDTO usuario) throws ServiceException{        
        Usuario u= new Usuario();
        u.setNombreusuario(usuario.getNombreusuario());
        u.setNombre(usuario.getNombre());
        u.setMail(usuario.getMail());
        u.setPasswordU(usuario.getPasswordU());
        em.persist(u);
        
    }
    
}
