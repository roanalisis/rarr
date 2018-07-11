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
import persistencia.Registrotemp;

/**
 *
 * @author rodrigorr
 */
@Service
public class ServiceConsultaRegistros {
    @PersistenceContext
    private EntityManager em;
    //
    
    public List<Registrotemp> BuscaTodosLosRegistros(){
        Query q = em.createNamedQuery("Registrotemp.findAll");
        List<Registrotemp> cargaList = q.getResultList(); 
        return cargaList; 
    }
    
    public int BuscaElUltimoIdRegistroPorId(int idreg){
        Query q = em.createNamedQuery("Registrotemp.findIdregMaxById");
        q.setParameter("idtermometro", idreg);
        int valor = (int) q.getSingleResult(); 
  

        return valor; 
    }
    
}
