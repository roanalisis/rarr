/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testConnection;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rodrigorr
 */
@WebServlet(name = "TestConnectionServlet", urlPatterns = {"/TestConnectionServlet"})
public class TestConnectionServlet extends HttpServlet {

    private EntityManagerFactory emf;
    private EntityManager em;
    
    public TestConnectionServlet(){
        emf = Persistence.createEntityManagerFactory("Adam6015PU");
        em = emf.createEntityManager();
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);        
        try {
            Query q = em.createQuery("SELECT t.texto FROM Testconnection t");  
            System.out.println(q.getSingleResult());
            System.out.println("**************pppppppppppppppp**********ooooooooooooo");
            
            
            response.setContentType( "application/json" );
            try(PrintWriter out = response.getWriter()){
                out.println(q.getSingleResult()); 
            } catch (Exception e) {
                out.println(e.getMessage());            
            } 
            
            
        } catch (Exception e) {
            System.out.println("´{{{¨¨¨¨¨}}****: "+ e.getMessage());
            out.println(e.getMessage());            
        }

    }

    

}
