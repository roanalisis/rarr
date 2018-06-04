package presentacion;

import dto.UsuarioDTO;
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
import servicio.ServiceUsuario;

/**
 *
 * @author rodrigorr
 */
@Controller
@RequestMapping(value="/agregarUsuario.htm") //dar un valor en donde va a ser observada una url
public class UsuarioController {
    
    @Autowired
    private ServiceUsuario servicio;

    
    @RequestMapping(method=RequestMethod.GET)
    public String consultar(Model model){
        UsuarioDTO usuario = new UsuarioDTO();
        model.addAttribute("usuario", usuario);  
        return "usuarioCrear";   
    }
    @RequestMapping(method=RequestMethod.POST)
    public String procesar(@Valid @ModelAttribute("usuario") UsuarioDTO usuario, BindingResult resul, Model model) throws ServiceException{
        if(resul.hasErrors()){
            return "usuarioCrear";
        }else{
            try {
                servicio.agregarUsuario(usuario);
                model.addAttribute("mens", "guardado");
                return "usuarioCrear";
            } catch (UnexpectedRollbackException e) {


                return "usuarioError";
            }
        }
    }
    
}
