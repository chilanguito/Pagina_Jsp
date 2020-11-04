/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author diegonarvaez
 */
@WebServlet(name = "prueba_logica", urlPatterns = {"/prueba_logica"})
public class prueba_logica extends HttpServlet {

    private int v1, v2, res;
    private String opcion, op;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        v1 = Integer.parseInt(request.getParameter("valor1"));

        v2 = Integer.parseInt(request.getParameter("valor2"));

        opcion = request.getParameter("operacion");

        /*Validacion
        
         */
        System.out.print("Valor de la caja 1" + v1);
        System.out.print("Valor de la caja 2" + v2);
        System.out.print("Valor de la lista" + opcion);

        Logica obj = new Logica();

        if (opcion.equals("suma")) {
            res = obj.sumar(v1, v2);
            op = " +  ";
        } else if (opcion.equals("resta")) {
            res = obj.restar(v1, v2);
            op = " -  ";
        } else if (opcion.equals("multiplicacion")) {
            res = obj.multiplicar(v1, v2);
            op = " *  ";
        } else if (opcion.equals("division")) {
            res = obj.dividir(v1, v2);
            op = " /  ";
        }

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet prueba_logica</title>");
            out.println("<link href='css/style.css' rel='stylesheet' type='text/css'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center><img src='imagenes/diego.jpeg'> <p>Alumno: Narváez Barete Diego</p>");
            
            out.println("<table border='1' width='400px'>");
            out.println("<tr><td><p>Detalles</p></td></tr>");
            out.println("<tr><td>Selecciono: "+opcion+"</td></tr>");
            out.println("<tr><td><marquee><H1>" + v1 + op + v2 + " = " + res + "</h1></marquee></td></tr>");
            
            out.println("<tr><td><p>Para realizar una nueva operacion <br> da click en el siguiente hipervinculo</p></center></td></tr>");
            
            out.println("<tr><td><center><a href='index.jsp'> Nuevo </a></center></td> </table></tr>");

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
