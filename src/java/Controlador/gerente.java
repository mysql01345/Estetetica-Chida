/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
 import java.sql.*;
/**
 *
 * @author migue
 */
public class gerente {

public gerente verificaGerente(String user, String clave){
        //incializar las variables u objetos
        gerente g = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            
            con = Conexion.getConnection();
           
            String q  = "Select * from mempleado  where  usuario_emp = ? AND clave_emp = ? ";
            ps = con.prepareStatement(q);
            
            //paso los parametros de usuario y clave
            ps.setString(1, user);
            ps.setString(2, clave);
            //realizo la consulta
            rs = ps.executeQuery();
            //busco al usuario dentro de la tabla
            while(rs.next()){
                //el objeto de usuario
                g = new gerente();
               // u.setUsuario_Codigo(rs.getInt("usuario_Codigo"));
               //u.setUsuario_Nombre(rs.getString("usuario_Nombre"));
               //u.setUsuario_Apellido(rs.getString("usuario_Apellido"));
                g.setUsuario_emp(rs.getString("usuario_emp"));
                g.setClave_emp(rs.getString("clave_emp"));
                g.setPrivi_emp(rs.getInt("privi_emp"));
                break;
            }
        
        }catch(SQLException e){
            System.out.println("Error al conectar con la tabla");
            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            g = null;
        
        }finally{
            try{
                rs.close();
                ps.close();
                con.close();
            
            }catch(Exception e){
            
            }
        
        }
        return g;
              
    }
 public int getPrivi_emp() {
        return privi_emp;
    }

    public void setPrivi_emp(int privi_emp) {
        this.privi_emp = privi_emp;
    }

    public String getUsuario_emp() {
        return usuario_emp;
    }

    public void setUsuario_emp(String usuario_emp) {
        this.usuario_emp = usuario_emp;
    }

    public String getClave_emp() {
        return clave_emp;
    }

    public void setClave_emp(String clave_emp) {
        this.clave_emp = clave_emp;
    }
    
    private int privi_emp;
    private String usuario_emp,clave_emp;
    

}