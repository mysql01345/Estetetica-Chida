/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.Acciones_Cliente;
import Controlador.Cliente;
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
public class Editar_Cliente extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            
            
            int id_cli,tel_cli ;
            String nom_cli,appat_cli, apmat_cli,correo_cli,user_musr,pass_musr,sex_cli ;
            
            nom_cli = request.getParameter("nombre");
            appat_cli= request.getParameter("paterno");
            apmat_cli =  request.getParameter("materno");
            tel_cli= Integer.parseInt(request.getParameter("telefono"));
            correo_cli = request.getParameter("correo");
            user_musr = request.getParameter("usuario");
            pass_musr= request.getParameter("contrasena");
            sex_cli = request.getParameter("sexo");
           
            
            //Necesisto un oj cliente
             System.out.println(nom_cli);
             System.out.println(appat_cli);
             System.out.println(apmat_cli);
             System.out.println(apmat_cli);
             System.out.println(correo_cli);
             System.out.println(user_musr);
             System.out.println(pass_musr);
             System.out.println(sex_cli);
             
             
            Cliente c = new Cliente();
            
            c.setNom_cli(nom_cli);
            c.setAppat_cli(appat_cli);
            c.setApmat_cli(apmat_cli);
            c.setTel_cli(tel_cli);
            c.setCorreo_cli(correo_cli);
            c.setUser_musr(user_musr);
            c.setPass_musr(pass_musr);
            c.setSex_cli(sex_cli);
            
            
            //Ejecutar la sentencia o queery
            
            int estatus =  Acciones_Cliente.Actualizar(c);
 
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Guardar_Cliente</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            if(estatus > 0){
                out.println("<h1>Registro Exitosoo</h1>"
                    + "<br>"
                    + "<a href='Cliente.js' ></a>");
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
