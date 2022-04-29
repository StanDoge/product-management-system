package Clases;

import Formularios.Registro;

import javax.swing.*;

public abstract class Sesion {
    static String usuario = "user";
    static String pswUsuario = "sistema";
    static String admin = "admin";
    static String pswAdmin = "PRN2";

    public static boolean iniciarSesion(String us, String pswUs, String adm, String pswAdm) {
        if (us.equals(Sesion.usuario) && pswUs.equals(Sesion.pswUsuario) || adm.equals(Sesion.admin)
                && pswAdm.equals(Sesion.pswAdmin)) {
            Registro sistema = new Registro();
            sistema.setVisible(true);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente sus credenciales");
            return false;
        }
    }
}