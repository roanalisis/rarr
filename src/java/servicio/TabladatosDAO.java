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
import persistencia.Registrotemp;

/**
 *
 * @author rodrigorr
 */
public class TabladatosDAO {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public TabladatosDAO(){
        emf = Persistence.createEntityManagerFactory("Adam6015PU");
        em = emf.createEntityManager();
    }
    
    
    
    public List<Registrotemp> BuscaTodasLasTemperaturas(){
        Query q = em.createQuery("SELECT r FROM Registrotemp r");
        List<Registrotemp> cargaList = q.getResultList(); 
        return cargaList;
    }
}
