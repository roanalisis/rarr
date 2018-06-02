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
        t.setIdTerm(termometro.getIdTerm());
        t.setClase(termometro.getClase());
        t.setNombre(termometro.getNombre());
        t.setDirip(termometro.getDirip());
        t.setDirpuerto(termometro.getDirpuerto());
        em.persist(t);
        
    }
    
}
