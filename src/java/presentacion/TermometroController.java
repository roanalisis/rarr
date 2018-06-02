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
import servicio.ServiceException;
import servicio.ServiceTermometro;



@Controller
@RequestMapping(value="/agregarTermometro.htm") //dar un valor en donde va a ser observada una url
public class TermometroController {
    
    
    @Autowired
    private ServiceTermometro servicio;

    
    @RequestMapping(method=RequestMethod.GET)
    public String consultar(Model model){
        TermometroDTO termometro = new TermometroDTO();
        model.addAttribute("termometro", termometro);  
        return "termometroCrear";   
    }
    @RequestMapping(method=RequestMethod.POST)
    public String procesar(@Valid @ModelAttribute("termometro") TermometroDTO termometro, BindingResult resul, Model model) throws ServiceException{
        if(resul.hasErrors()){
            return "termometroCrear";
        }else{
            try {
                servicio.agregarTermometro(termometro);
                model.addAttribute("mensaje","Termómetro registrado con éxito.");
                model.addAttribute("idd",termometro.getIdTerm());
                model.addAttribute("cla",termometro.getClase());
                model.addAttribute("nom",termometro.getNombre());
                model.addAttribute("dip",termometro.getDirip());
                model.addAttribute("dpu",termometro.getDirpuerto());
                return "termometroCrear";
            } catch (UnexpectedRollbackException e) {
//                if(e.getRootCause().getLocalizedMessage().indexOf("idcargo=0")!= -1){
//                    model.addAttribute("erR","No ha seleccionado el cargo.");                
//                }else{
//                    if(e.getRootCause().getLocalizedMessage().indexOf("rutemp=0")!= -1){
//                        model.addAttribute("erR","No ha seleccionado la empresa.");  
//                    }else{
//                        model.addAttribute("erR","¡Usuario ya existe!");                     
//                    }                
//                }

                return "termometroError";
            }
        }
    }
    
}
