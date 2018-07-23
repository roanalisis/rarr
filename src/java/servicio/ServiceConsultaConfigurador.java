/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Service;
import persistencia.Configurador;
import persistencia.Usuario;

/**
 *
 * @author rodrigorr
 */
@Service
public class ServiceConsultaConfigurador {
    
    @PersistenceContext
    private EntityManager em;
    //
    
    public List<Configurador> BuscaByNombreUsuario(String nombreusuario){
        Query q = em.createNamedQuery("Configurador.findByNombreusuario");
        q.setParameter("nombreusuario", nombreusuario);
        List<Configurador> cargaList = q.getResultList(); 
        return cargaList;  

        
    }
    
    public List<Configurador> BuscaByNombreUsuarioyPassword(String nombreusuario, String password){
        Query q = em.createNamedQuery("Configurador.findByUsuarioyPassword");
        q.setParameter("nombreusuario", nombreusuario);
        q.setParameter("password", password);
        List<Configurador> cargoList = q.getResultList(); 
        return cargoList;  

        
    }
    
}
