/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author migue
 */
import java.util.*;
import java.sql.*;

public class Acciones_Empleado {
    
    public static int Guardar(Empleado m){
    int estatus = 0;
    
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
     try {
         con = Conexion.getConnection();
      // Voy a mandar a llamar a mi metedo de conexion
        
             System.out.println("nom_emp + controlador");
             System.out.println("appat_emp");
             System.out.println("apmat_emp");
             System.out.println("usuario_emp");
             System.out.println("clave_emp");
             System.out.println("privi_emp");
             System.out.println("CEmpleado_id_Empleado");
             
      
      //ahora establezco mi querry

          String  q = "insert into mempleado (nom_emp,appat_emp,apmat_emp,usuario_emp,clave_emp,privi_emp,CEmpleado_id_cemp)"
            +  "values (?,?,?,?,?,?,?)";
//preparamos la sentencia de la querry
            ps = con.prepareStatement(q);

// //tanto obtener como enviar los parametros gracias al encapsulamiento
             
             
             ps.setString(1, m.getNom_emp());
             ps.setString(2, m.getAppat_emp());
             ps.setString(3,m.getApmat_emp());
             ps.setString(4, m.getUsuario_emp());
             ps.setString(5, m.getClave_emp());
             ps.setInt(6,m.getPrivi_emp());
             ps.setInt(7,m.getCEmpleado_id_cemp());
             
             
            
            estatus = ps.executeUpdate();
            con.close();
            System.out.println("Registro exitoso");
            
        }catch(Exception e){
            
            System.out.println("No encontro la tabla");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return estatus;
   }
    
}
