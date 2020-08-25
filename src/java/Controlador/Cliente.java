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
public class Cliente {
    /*
    vamos a implementar el poo, utilizando el principio de encapsulamiento
    para proteger los datos que se comunican con la bd.
    Esta clase representa la tabla de la BD
    */
private int id_cli, tel_cli;
private String nom_cli,appat_cli, apmat_cli,correo_cli,user_musr,pass_musr,sex_cli ;



    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

 

    public int getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(int tel_cli) {
        this.tel_cli = tel_cli;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getAppat_cli() {
        return appat_cli;
    }

    public void setAppat_cli(String appat_cli) {
        this.appat_cli = appat_cli;
    }

    public String getApmat_cli() {
        return apmat_cli;
    }

    public void setApmat_cli(String apmat_cli) {
        this.apmat_cli = apmat_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }

    public String getUser_musr() {
        return user_musr;
    }

    public void setUser_musr(String user_musr) {
        this.user_musr = user_musr;
    }

    public String getSex_cli() {
        return sex_cli;
    }

    public void setSex_cli(String sex_cli) {
        this.sex_cli = sex_cli;
    }
       public String getPass_musr() {
        return pass_musr;
    }

    public void setPass_musr(String pass_musr) {
        this.pass_musr = pass_musr;
    }
    
} 

    



