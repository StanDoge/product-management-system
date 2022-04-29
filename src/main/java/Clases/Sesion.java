package Clases;

import Formularios.Registro;

import javax.swing.*;

public class Sesion {
    String usuario;
    String pswUsuario;
    String admin;
    String pswAdmin;

    //Getters & Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPswUsuario() {
        return pswUsuario;
    }

    public void setPswUsuario(String pswUsuario) {
        this.pswUsuario = pswUsuario;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPswAdmin() {
        return pswAdmin;
    }

    public void setPswAdmin(String pswAdmin) {
        this.pswAdmin = pswAdmin;
    }

    public static boolean iniciarSesion(String us, String pswUs, String adm, String pswAdm) {
        if (us.equals("user") && pswUs.equals("sistema") || adm.equals("admin") && pswAdm.equals("PRN2")) {
            Registro sistema = new Registro();
            sistema.setVisible(true);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente sus credenciales");
            return false;
        }
    }
}