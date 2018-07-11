/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.RegistrosDAO;
import servicio.ServiceConsultaRegistros;

/**
 *
 * @author rodrigorr
 */
@WebServlet(name = "traeUltimoRegistroServlet", urlPatterns = {"/traeUltimoRegistroServlet"})
public class traeUltimoRegistroServlet extends HttpServlet {
    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String idterm = request.getParameter("idterm");
        //ServiceConsultaRegistros buscaUltIdRegPorId = new ServiceConsultaRegistros();
        RegistrosDAO buscaUltIdRegPorId = new RegistrosDAO();
        try {
            int id = idterm.equals("") ? 0 : Integer.parseInt(idterm);
            int resultado = buscaUltIdRegPorId.BuscaElUltimoIdRegistroPorId1(id); 
            float temperatura = buscaUltIdRegPorId.BuscaTemperaturaFinalDeidreg(resultado);
            String objectToReturn = "{ \"temp\": \""+ temperatura+"\"}"; 
            
            response.setContentType( "application/json" );
                try(PrintWriter out = response.getWriter()){
                    out.println(objectToReturn);
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
            System.out.println("mensaje:"+ e.getMessage());
        }
        
        

                  

            


        
        
        


    }

    

}
