/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author rodrigorr
 */
public class RegistrosDAO {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public RegistrosDAO(){
        emf = Persistence.createEntityManagerFactory("Adam6015PU");
        em = emf.createEntityManager();
    }
    
    public int BuscaElUltimoIdRegistroPorId1(int idreg){
        Query q = em.createQuery("select max(r.idreg) from Registrotemp r where r.idtermometro.idterm = :idtermometro");
        q.setParameter("idtermometro", idreg);
        int valor = (int) q.getSingleResult(); 
  

        return valor; 
    }
    
    public float BuscaTemperaturaFinalDeidreg(int idreg){
        Query q = em.createQuery("select r.temperatura from Registrotemp r where r.idreg = :idreg");
        q.setParameter("idreg", idreg);
        float valor = (float) q.getSingleResult(); 
  

        return valor; 
    }
    
    
    
    
    
}
