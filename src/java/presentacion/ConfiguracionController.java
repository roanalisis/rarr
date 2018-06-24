package presentacion;
import dto.ConfiguracionDTO;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import servicio.ServiceConfiguracion;
import servicio.ServiceConsultaTermometros;
import servicio.ServiceException;
/**
 *
 * @author rodrigorr
 */
@Controller
@RequestMapping(value="/configuracion.htm") //dar un valor en donde va a ser observada una url
public class ConfiguracionController {
   @Autowired
   private ServiceConfiguracion servicio;
   @Autowired
   private ServiceConsultaTermometros servicioCons;

   
   @RequestMapping(method=RequestMethod.GET)
   public String consultar(Model model){
       ConfiguracionDTO configuracion = new ConfiguracionDTO();
       model.addAttribute("configuracion", configuracion);
       model.addAttribute("lisTerm", servicioCons.listarTermometros());
         
       return "ConfiguracionCrear";  
   }
   
   @RequestMapping(method=RequestMethod.POST)
   public String procesar(@Valid @ModelAttribute("configuracion") ConfiguracionDTO configuracion, BindingResult resul, Model model) throws ServiceException{
        if(resul.hasErrors()){
            model.addAttribute("mensAj", resul.getFieldError());
            return "ConfiguracionCrear";
        }else{
            try {
                servicio.agregarConfiguracion(configuracion);
                model.addAttribute("mensAj", "guardado");
                model.addAttribute("maxim", configuracion.getMaxim());
                model.addAttribute("minim", configuracion.getMinim());
                model.addAttribute("intervaloH", configuracion.getIntervaloH());
                model.addAttribute("intervaloM", configuracion.getIntervaloM());
                model.addAttribute("intervaloS", configuracion.getIntervaloS());
                model.addAttribute("lisTerm", servicioCons.listarTermometros());
                return "ConfiguracionCrear";
            } catch (UnexpectedRollbackException e) {


                return "ConfiguracionCrear";
            }
        }
   }
    
}
