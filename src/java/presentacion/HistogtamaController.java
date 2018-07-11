package presentacion;

import dto.ConfiguracionDTO;
import dto.RegistrotempDTO;
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
import servicio.RegistrosDAO;
import servicio.ServiceConsultaRegistros;
import servicio.ServiceConsultaTermometros;
import servicio.ServiceException;

/**
 *
 * @author rodrigorr
 */
@Controller
@RequestMapping(value="/histograma.htm") //dar un valor en donde va a ser observada una url
public class HistogtamaController {
    
    @Autowired
   private ServiceConsultaTermometros servicioCons;

    
    @RequestMapping(method=RequestMethod.GET)
    public String consultar(Model model){  
       TermometroDTO termometro = new TermometroDTO();
       model.addAttribute("termometro", termometro);
       model.addAttribute("lisTerm", servicioCons.listarTodos());
       
       RegistrosDAO buscaUltIdRegPorId = new RegistrosDAO();
        try {
            int id = servicioCons.listarTodos().get(0).getIdterm();
            int resultado = buscaUltIdRegPorId.BuscaElUltimoIdRegistroPorId1(id);
            model.addAttribute("lastTemp", resultado);
        } catch (Exception e) {
            System.out.println("mensaje:"+ e.getMessage());
        }
       
       
        return "histogramaJSP";   
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String procesar(@Valid @ModelAttribute("termometro") TermometroDTO termometro, BindingResult resul, Model model) throws ServiceException{
        System.out.println(resul.toString()); 
        if(resul.hasErrors()){                 
             return "histogramaJSP";
         }else{
             try {                 
                 return "histogramaJSP";
             } catch (UnexpectedRollbackException e) {

                 return "histogramaJSP";
             }
         }
    }
    
}
