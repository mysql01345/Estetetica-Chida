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

public class Acciones_Cliente {
    
    


//Metodos corrrespondiente para gurdar 
    public static int Guardar(Cliente c){
    int estatus = 0;
    
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
     try {
         con = Conexion.getConnection();
      // Voy a mandar a llamar a mi metedo de conexion
        

      //ahora establezco mi querry

          String  q = "insert into mcliente (nom_cli,appat_cli,apmat_cli,tel_cli,correo_cli,user_musr,pass_musr,sex_cli)"
            +  "values (?,?,?,?,?,?,?,?)";
//preparamos la sentencia de la querry
            ps = con.prepareStatement(q);

// //tanto obtener como enviar los parametros gracias al encapsulamiento
             
             
             ps.setString(1, c.getNom_cli());
             ps.setString(2, c.getAppat_cli());
             ps.setString(3, c.getApmat_cli());
             ps.setInt(4,c.getTel_cli());
             ps.setString(5, c.getCorreo_cli());
             ps.setString(6, c.getUser_musr());
             ps.setString(7, c.getPass_musr());
             ps.setString(8, c.getSex_cli());
            
              
             



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
    
//Editar
        
    
    
    public static int Actualizar(Cliente c){
        int estatus = 0;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            //voy a mandar a llamar a mi metodo de conexion
            con = Conexion.getConnection();
            //ahora establezco mi querry
            String q ="update mcliente set  nom_cli= ?,"
                    + "appat_cli = ?,"
                    + "apmat_cli =  ?,"
                    + "tel_cli =    ?,"
                    + "correo_cli =  ?," 
                    + "user_musr =   ?,"
                    + "pass_musr =   ?,"
                    + "sex_cli =      ?"
                    + "where id_cli= ?";
            
            
            
            
            //preparamos la sentencia de la querry
             ps = con.prepareStatement(q);
            //tanto obtener como enviar los parametros gracias al encapsulamiento
            
             ps.setString(1, c.getNom_cli());
             ps.setString(2, c.getAppat_cli());
             ps.setString(3, c.getApmat_cli());
             ps.setInt(4,c.getTel_cli());
             ps.setString(5, c.getCorreo_cli());
             ps.setString(6, c.getUser_musr());
             ps.setString(7, c.getPass_musr());
             ps.setString(8, c.getSex_cli());
             ps.setInt(9,c.getId_cli());
             
            estatus = ps.executeUpdate();
            con.close();
            System.out.println("Aztualizacion exitosa");
        }catch(Exception e){
            System.out.println("No encontro la tabla");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return estatus;
    }

        /**/
        
}