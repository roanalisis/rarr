/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.Registrotemp;
import servicio.RegistrosDAO;
import servicio.TabladatosDAO;

/**
 *
 * @author rodrigorr
 */
@WebServlet(name = "TabladedatosServlet", urlPatterns = {"/TabladedatosServlet"})
public class TabladedatosServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idterm = request.getParameter("idterm");
        //ServiceConsultaRegistros buscaUltIdRegPorId = new ServiceConsultaRegistros();
        TabladatosDAO buscar = new TabladatosDAO();
        try {
            int id = idterm.equals("") ? 0 : Integer.parseInt(idterm);
            int registros = buscar.BuscaTodasTemperaturaPorid(id); 
            String objectToReturn = "{ \"temps\": \""+ registros+"\"}"; 
            
            response.setContentType( "application/json" );
                try(PrintWriter out = response.getWriter()){
                    out.println(objectToReturn);
                }
        } catch (Exception e) {
            System.out.println("mensaje:"+ e.getMessage());
        }
    }


}
