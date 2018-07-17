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
    
    public int BuscaTodasTemperaturaPorid(int id){
//        Query q = em.createQuery("select r from Registrotemp r where r.idtermometro.idterm = :idtermometro ORDER BY r.tmestamp DESC");
//        q.setParameter("idreg", id);
//        List cargaList = q.getResultList(); 
//        return cargaList;
        Query q = em.createQuery("select max(r.idreg) from Registrotemp r where r.idtermometro.idterm = :idtermometro");
        q.setParameter("idtermometro", id);
        int valor = (int) q.getSingleResult(); 
  

        return valor; 
    }
    
    
    public List<Registrotemp> BuscaTodasLasTemperaturas(){
        Query q = em.createQuery("SELECT r FROM Registrotemp r");
        List<Registrotemp> cargaList = q.getResultList(); 
        return cargaList;
    }
}
