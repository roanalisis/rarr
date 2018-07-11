/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import dto.RegistrotempDTO;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import servicio.ServiceConsultaRegistros;
import servicio.ServiceException;

/**
 *
 * @author rodrigorr
 */
@Controller
@RequestMapping(value="/registros.htm") //dar un valor en donde va a ser observada una url
public class RegistroController {

    @Autowired
    private ServiceConsultaRegistros servicioCons;

    
    @RequestMapping(method=RequestMethod.GET)
    public String consultar(Model model){
        RegistrotempDTO registrotemp = new RegistrotempDTO();
        model.addAttribute("registrotemp", registrotemp); 
        model.addAttribute("lisReg", servicioCons.BuscaTodosLosRegistros());
        return "tabladedatos";   
    }
    
    @RequestMapping(method=RequestMethod.POST)
   public String procesar(@Valid @ModelAttribute("registrotemp") RegistrotempDTO registrotemp, BindingResult resul, Model model) throws ServiceException{
       if(resul.hasErrors()){
            model.addAttribute("lisReg", servicioCons.BuscaTodosLosRegistros());
            return "tabladedatos";
        }else{
            try {    
                model.addAttribute("lisReg", servicioCons.BuscaTodosLosRegistros());
                return "tabladedatos";
            } catch (UnexpectedRollbackException e) {

                return "tabladedatos";
            }
        }
   }
    
}
