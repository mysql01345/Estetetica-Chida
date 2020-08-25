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
public class Empleado {
    
private int id_emp,privi_emp,CEmpleado_id_cemp;
private String nom_emp,appat_emp,apmat_emp,usuario_emp,clave_emp;

    public int getCEmpleado_id_cemp() {
        return CEmpleado_id_cemp;
    }

    public void setCEmpleado_id_cemp(int CEmpleado_id_cemp) {
        this.CEmpleado_id_cemp = CEmpleado_id_cemp;
    }


    public int getPrivi_emp() {
        return privi_emp;
    }

    public void setPrivi_emp(int privi_emp) {
        this.privi_emp = privi_emp;
    }

    public String getApmat_emp() {
        return apmat_emp;
    }

    public void setApmat_emp(String apmat_emp) {
        this.apmat_emp = apmat_emp;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public String getNom_emp() {
        return nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public String getAppat_emp() {
        return appat_emp;
    }

    public void setAppat_emp(String appat_emp) {
        this.appat_emp = appat_emp;
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

}


