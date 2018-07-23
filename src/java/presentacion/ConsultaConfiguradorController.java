/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import dto.ConfiguradorDTO;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import persistencia.Configurador;
import servicio.ServiceConsultaConfigurador;
import servicio.ServiceException;

/**
 *
 * @author rodrigorr
 */
@Controller
@RequestMapping(value="/loginConfigurador.htm") //dar un valor en donde va a ser observada una url
public class ConsultaConfiguradorController {
    
    @Autowired
   private ServiceConsultaConfigurador servicio;
    
    
    @RequestMapping(method=RequestMethod.GET)
   public String consultar(Model model){
       ConfiguradorDTO configurador = new ConfiguradorDTO();
       model.addAttribute("configurador", configurador);
       
       
         
       return "loginConfigurador";  
   }
   
   @RequestMapping(method=RequestMethod.POST)
   public String procesar(@Valid @ModelAttribute("configurador") ConfiguradorDTO configurador, BindingResult resul, Model model) throws ServiceException{
       if(resul.hasErrors()){
           return "loginConfigurador";
       }else{
           try {
               
               List<Configurador> usuarioList = servicio.BuscaByNombreUsuarioyPassword(configurador.getNombreusuario(), configurador.getPassword());
               model.addAttribute("lsd", usuarioList);
               if(usuarioList.isEmpty()) {
                   System.out.println(usuarioList);
                   model.addAttribute("mensaje", "Usuario o Password incorrectos."); 
                   return "loginConfigurador"; 
               }else{
                   model.addAttribute("mensaje", "Encontrado"); 
                   return "indexConfigurador"; 
               }
               
               
           } catch (UnexpectedRollbackException e) {                                       
               model.addAttribute("erR",e.getRootCause().getLocalizedMessage());
               return "loginConfigurador";
           }
       }
   }
    
}
