/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.Acciones_Empleado;
import Controlador.Empleado;
import Controlador.gerente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author migue
 */
public class Guardar_Empleado extends HttpServlet {

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
              
        int id_emp, privi_emp, CEmpleado_id_cemp;
        String nom_emp,appat_emp,apmat_emp,usuario_emp,clave_emp;
    
    
        nom_emp = request.getParameter("nombre");
        appat_emp= request.getParameter("paterno");
        apmat_emp=request.getParameter("materno");
        usuario_emp = request.getParameter("usuario");
        clave_emp =request.getParameter("contrasena");
        privi_emp= Integer.parseInt(request.getParameter("privilegio"));
        CEmpleado_id_cemp = Integer.parseInt(request.getParameter("Empleado"));
     
        Empleado m = new Empleado();
     
  
        m.setNom_emp(nom_emp);
        m.setAppat_emp(appat_emp);
        m.setApmat_emp(apmat_emp);
        m.setUsuario_emp(usuario_emp);
        m.setClave_emp(clave_emp);
        m.setPrivi_emp(privi_emp);
        m.setCEmpleado_id_cemp(CEmpleado_id_cemp);
        
        
             System.out.println(nom_emp);
             System.out.println(appat_emp);
             System.out.println(apmat_emp);
             System.out.println(usuario_emp);
             System.out.println(clave_emp);
             System.out.println(privi_emp);
             System.out.println(CEmpleado_id_cemp);

             
        
     
     int estatus = Acciones_Empleado.Guardar(m);
     
      out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Guardar_Empleado</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            if(estatus > 0){
                out.println("<h1>Registro Exitoso</h1>"
                    + "<br>"
                    + "<a href='index.html' >Regresar al Menu</a>");
            }else{
                 out.println("<h1>No se pudo realizar el registro</h1>"
                    + "<br>"
                    + "<a href='index.html' >Regresar al Menu</a>");
            }
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
