package presentacion;

import dto.UsuarioDTO;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
import servicio.PasswordsDAO;
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
                
                PasswordsDAO objBuscaPass_Correo = new PasswordsDAO();
                List<Usuario> resultado = objBuscaPass_Correo.BuscaPass_y_Correo_de_Usuario(usuario.getNombreusuario()); 
                System.out.println("RESULTADO...:"+ resultado.get(0).getNombreusuario());
                System.out.println("RESULTADO...:"+ resultado.get(0).getPasswordU());
                System.out.println("RESULTADO...:"+ resultado.get(0).getMail());
                
                try {
                    String host = "smtp.gmail.com";
                    Properties prop = System.getProperties();

                    prop.put("mail.smtp.starttls.enable","true");
                    prop.put("mail.smtp.host",host);
                    prop.put("mail.smtp.user","a.t.a.noreply@gmail.com");       
                    prop.put("mail.smtp.password","QWer1234");  
                    prop.put("mail.smtp.port", "587");
                    prop.put("mail.smtp.auth", "true"); //Autenticación

                    Session session = Session.getDefaultInstance(prop,null);
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress("a.t.a.noreply@gmail.com"));

                    message.setRecipient(Message.RecipientType.TO, new InternetAddress(resultado.get(0).getMail()));
                    message.setSubject("Envío de password.");
                    message.setText("Sus credenciales son las siguientes: "
                        + "\n\n Usuario: "+ resultado.get(0).getNombreusuario()
                        + "\n\n Clave: "+ resultado.get(0).getPasswordU()
                        + "\n\n -------------------- \n\n Este correo ha "
                        + "sido generado y enviado automaticamente, por favor no "
                        + "responda a este mensaje.\n\nA.T.A");



                    Transport transport = session.getTransport("smtp");
                    transport.connect(host,"a.t.a.noreply@gmail.com","QWer1234");
                    transport.sendMessage(message, message.getAllRecipients());

                    //Para que funcione, habilitar la cuenta "desde" "mail.smtp.user", aquí https://myaccount.google.com/lesssecureapps?pli=1

                    transport.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                
                return "usuarioCrear";
            } catch (UnexpectedRollbackException e) {
                return "usuarioCrear";
            }
        }
    }
    
}
