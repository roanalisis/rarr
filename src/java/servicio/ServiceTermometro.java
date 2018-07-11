/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import dto.TermometroDTO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import persistencia.Termometro;

/**
 *
 * @author rodrigorr
 */
@Service
public class ServiceTermometro {
    @PersistenceContext
    private EntityManager em;
    
    @Transactional(rollbackOn = {ServiceException.class})
    public void agregarTermometro(TermometroDTO termometro) throws ServiceException{
        Termometro t = new Termometro();
        t.setClase(termometro.getClase());
        t.setNombre(termometro.getNombre());
        t.setDirip(termometro.getDirip());
        t.setDirpuerto(termometro.getDirpuerto());
        t.setRangomax(termometro.getRangomax());
        t.setRangomin(termometro.getRangomin());
        em.persist(t);
        
    }
    @PersistenceContext
    private EntityManager emm;
    @Transactional(rollbackOn = {ServiceException.class})
    public void actualizarTermometro(TermometroDTO termometro) throws ServiceException{
        
        try {
        Termometro t = new Termometro();
        t.setIdterm(termometro.getIdterm());
        t.setClase(termometro.getClase());
        t.setNombre(termometro.getNombre());
        t.setDirip(termometro.getDirip());
        t.setDirpuerto(termometro.getDirpuerto());
        t.setRangomax(termometro.getRangomax());
        t.setRangomin(termometro.getRangomin());
        emm.merge(t);
            
        } catch (Exception e) {
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ " + e);
            
        }
        
    }
    
//    @Transactional(rollbackOn = {ServiceException.class})
//    public void eliminarTermometro(TermometroDTO termometro) throws ServiceException{
//        Termometro t = new Termometro();
//        t.setIdterm(termometro.getIdterm());
//        emm.remove(t);
//    }
    
}
