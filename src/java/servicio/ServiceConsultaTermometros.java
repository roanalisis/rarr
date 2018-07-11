package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import persistencia.Configuracion;
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
        Query q2 = em.createNamedQuery("Configuracion.findAll");
        List<Termometro> termometroList = q.getResultList();
        List<Configuracion> configuracionList = q2.getResultList();
        
        List<Termometro> termometroResultList = new ArrayList<>();
        for(Termometro t: termometroList) {
            Boolean check = false;
            for(Configuracion c : configuracionList) {
                    if(t.getIdterm() == c.getIdtermometro().getIdterm()) {
                        check = true;
                    }
                 }
            if(check == false) {
                termometroResultList.add(t);
            }
        }
        return termometroResultList; 
    }
    
    public List<Termometro> listarTodos(){
        Query q = em.createNamedQuery("Termometro.findAll");
        List<Termometro> termometroList = q.getResultList();        
        return termometroList; 
    }
    
}
