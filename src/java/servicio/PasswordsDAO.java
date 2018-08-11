/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import persistencia.Configurador;
import persistencia.Usuario;

/**
 *
 * @author rodrigorr
 */
public class PasswordsDAO {
    
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public PasswordsDAO(){
        emf = Persistence.createEntityManagerFactory("Adam6015PU");
        em = emf.createEntityManager();
    }
    
    
    public List<Configurador> BuscaPass_y_Correo(String nombreusuario){        
        Query q = em.createQuery("SELECT c FROM Configurador c WHERE c.nombreusuario = :nombreusuario");
        q.setParameter("nombreusuario", nombreusuario);
        List<Configurador> cargaList = q.getResultList(); 
        return cargaList;
    }
    
    public List<Usuario> BuscaPass_y_Correo_de_Usuario(String nombreusuario){        
        Query q = em.createQuery("SELECT u FROM Usuario u WHERE u.nombreusuario = :nombreusuario");
        q.setParameter("nombreusuario", nombreusuario);
        List<Usuario> cargaList = q.getResultList(); 
        return cargaList;
    }
    
}
