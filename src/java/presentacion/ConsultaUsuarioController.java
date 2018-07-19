package presentacion;

import dto.UsuarioDTO;
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
import persistencia.Usuario;
import servicio.ServiceConsultaUsuario;
import servicio.ServiceException;


@Controller
@RequestMapping(value="/login.htm") //dar un valor en donde va a ser observada una url
public class ConsultaUsuarioController {
   @Autowired
   private ServiceConsultaUsuario servicio;

   
   @RequestMapping(method=RequestMethod.GET)
   public String consultar(Model model){
       UsuarioDTO usuario = new UsuarioDTO();
       model.addAttribute("usuario", usuario);
       
       
         
       return "loginUsuario";  
   }
   
   @RequestMapping(method=RequestMethod.POST)
   public String procesar(@Valid @ModelAttribute("usuario") UsuarioDTO usuario, BindingResult resul, Model model) throws ServiceException{
       if(resul.hasErrors()){
           return "loginUsuario";
       }else{
           try {
               //model.addAttribute("mensaje","Denuncio ingresado con éxito.");
               //Busca primero por el Usuario 
               List<Usuario> usuarioUList = servicio.BuscaByNombreUsuario(usuario.getNombreusuario());
               boolean encontrado; 
               if(!usuarioUList.isEmpty()) {
                   encontrado = true;                   
               }else{
                   encontrado = false;
               }               
               
               
               List<Usuario> usuarioList = servicio.BuscaByNombreUsuarioyPassword(usuario.getNombreusuario(), usuario.getPasswordU());
               model.addAttribute("lsd", usuarioList);
               if(!usuarioList.isEmpty()) {
                   System.out.println(usuarioList);
                   return "index";
               } else {
                   if (encontrado = true){
                       model.addAttribute("mensaje", "Usuario o Password incorrectos.");
                   }else{
                       model.addAttribute("mensaje", "noencuentra");                       
                   }    
                   return "loginUsuario";
               }
               
               
           } catch (UnexpectedRollbackException e) {                              
               
               model.addAttribute("erR",e.getRootCause().getLocalizedMessage());

               return "loginUsuario";
           }
       }
   }
    
    
}
