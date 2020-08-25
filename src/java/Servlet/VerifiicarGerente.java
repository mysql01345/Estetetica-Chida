/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.gerente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author migue
 */
public class VerifiicarGerente extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            String user, clave;
                    
            user = request.getParameter("txtUsuario");
            clave = request.getParameter("txtPassword");
            
            //un objeto de usuario
            
            gerente g = new gerente();
            //verifique al usuario
            g = g.verificaGerente(user, clave);
            
            
      
            
            
            System.out.println("");
            System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println("Usuario: " + user);
            System.out.println("Clave: " + clave);
            System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println("");
            
            
            
               if(g!=null){
                //si el usuario existe en la bd, le vamos a crear una sesion de usuario
                HttpSession sesion = request.getSession(true);
                //enviar el objeto de la sesion
                sesion.setAttribute("usuario", g);
                //se envia el nombre de usuario
                
                HttpSession sesionok = request.getSession();
                sesionok.setAttribute("usuario", user);
                
                //vamos a verificar el privilegio para saber si es cliente o administrador
                
                if(g.getPrivi_emp()==1){
                    //el usuario es cliente
                    response.sendRedirect("Gerente.jsp");
                }else{
                    
                    //administrador
                    response.sendRedirect("");
                }
  
            }else{ 
                //no existe ese usuario en la bd o la clave es incorrecta
                response.sendRedirect("Error.jsp");
                
            }
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
