/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import dto.TermometroDTO;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import servicio.ServiceConsultaTermometros;
import servicio.ServiceException;
import servicio.ServiceTermometro;

/**
 *
 * @author rodrigorr
 */
@Controller
@RequestMapping(value="/modificarTermometros.htm") //dar un valor en donde va a ser observada una url
public class TermometroModificarController {
    
    @Autowired
    private ServiceTermometro servicio;
    @Autowired
    private ServiceConsultaTermometros servicioCons;

    
    @RequestMapping(method=RequestMethod.GET)
    public String consultar(Model model){
        TermometroDTO termometro = new TermometroDTO();
        model.addAttribute("termometro", termometro); 
        model.addAttribute("lisTerm", servicioCons.listarTodos());
        return "modificarTermometros";   
    }
    
    @RequestMapping(method=RequestMethod.POST)
   public String procesar(@Valid @ModelAttribute("termometro") TermometroDTO termometro, BindingResult resul, Model model) throws ServiceException{
       if(resul.hasErrors()){
            model.addAttribute("lisTerm", servicioCons.listarTodos());
            return "modificarTermometros";
        }else{
            try {    
                servicio.actualizarTermometro(termometro);
                model.addAttribute("lisTerm", servicioCons.listarTodos());
                return "modificarTermometros";
            } catch (UnexpectedRollbackException e) {

                return "modificarTermometros";
            }
        }
   }
    
}
