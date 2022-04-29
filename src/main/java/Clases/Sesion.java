package Clases;

import Formularios.Registro;

import javax.swing.*;

public abstract class Sesion {
    String usuario;
    String pswUsuario;
    String admin;
    String pswAdmin;


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