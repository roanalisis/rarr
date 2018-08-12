/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import servicio.ServiceException;

/**
 *
 * @author rodrigorr
 */
@Controller
@RequestMapping(value="/index.htm") //dar un valor en donde va a ser observada una url
public class IndexController {
    
    @RequestMapping(method=RequestMethod.GET)
    public String consultar(Model model){
        
        return "index";  
    }
   
//    @RequestMapping(method=RequestMethod.POST)
//    public String procesar(Model model) throws ServiceException{
//
//            try {
//                    return "index";
//            } catch (UnexpectedRollbackException e) {                  
//                model.addAttribute("erR",e.getRootCause().getLocalizedMessage());
//                return "index";
//            }
//    }
}
