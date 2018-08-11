/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.Configurador;
import persistencia.Usuario;
import servicio.PasswordsDAO;

/**
 *
 * @author rodrigorr
 */
@WebServlet(name = "EnviarCorreoServlet", urlPatterns = {"/EnviarCorreoServlet"})
public class EnviarCorreoServlet extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
System.out.println("ENTRÓ");
        String nomu = request.getParameter("nomu");
        String vienede = request.getParameter("vienede");
        //ServiceConsultaRegistros buscaUltIdRegPorId = new ServiceConsultaRegistros();        
        try {   
            PasswordsDAO objBuscaPass_Correo = new PasswordsDAO();
            if (vienede.equals("1")){ //Si viene del login configuradores
                List<Configurador> resultado = objBuscaPass_Correo.BuscaPass_y_Correo(nomu); 
                System.out.println("RESULTADO...:"+ resultado.get(0).getNombreusuario());
                System.out.println("RESULTADO...:"+ resultado.get(0).getPassword());
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
                        + "\n\n Clave: "+ resultado.get(0).getPassword() 
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
            }else{ //Si viene de la creación de usuarios
                List<Usuario> resultado = objBuscaPass_Correo.BuscaPass_y_Correo_de_Usuario(nomu); 
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
                
                
            }
            
            
            //String objectToReturn = "{ \"temp\": \""+ temperatura+"\"}"; 
            
            response.setContentType( "application/json" );
                try (PrintWriter out = response.getWriter()) {
//                out.println(objectToReturn);
//                    out.println("<table>");
//                    out.println("<tr>");
//                    out.println("la temperatura final de este termómetro es: "+ temperatura);
//                    out.println("</tr>");            
//                    out.println("</table>");
//                    request.setAttribute("tem", temperatura);
//                    request.getRequestDispatcher("/histogramaJSP.jsp").forward(request, response);
                //getServletConfig().getServletContext().getRequestDispatcher("/histogramaJSP.jsp").forward(request, response);
                    }
                } catch (Exception e) {
                    System.out.println("mensaje:" + e.getMessage());
                }



    }

    

}
