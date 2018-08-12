/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;
import javax.json.Json;
import static javax.json.Json.createObjectBuilder;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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
        
        
        //ServiceConsultaRegistros buscaUltIdRegPorId = new ServiceConsultaRegistros();
        TabladatosDAO buscar = new TabladatosDAO();
        try {                          
            

            ServletOutputStream out = response.getOutputStream();
            List<Registrotemp> registros = buscar.BuscaTodasLasTemperaturas();
            
            
            response.setContentType("application/json;charset=UTF-8");            
            JsonObjectBuilder rootBuilder = Json.createObjectBuilder();            
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            
            for (Registrotemp registro : registros) {
                JsonObjectBuilder registroBuilder = Json.createObjectBuilder();
                JsonObject registroJson = registroBuilder.add("idr", registro.getIdreg())
                .add("fecHora", (JsonValue) registro.getTmestamp())
                .add("temperatura", registro.getTemperatura())
                .add("nombre", registro.getIdreg())
                .add("activo", registro.getActive())
                .build();      
                
                arrayBuilder.add(registroJson);
            }
            
            JsonObject root = rootBuilder.add("registros", arrayBuilder).build();
            out.println("root"+ root);
            System.out.println("¨¨¨¨¨¨¨¨¨*************¨¨¨¨¨¨¨¨**************** "+ root);
   
            
        } catch (Exception e) {
            System.out.println("mensaje:"+ e.getMessage());
        }
    }


}