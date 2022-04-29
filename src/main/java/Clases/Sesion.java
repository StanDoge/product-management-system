package Clases;

import Formularios.Registro;

import javax.swing.*;

public abstract class Sesion {
    static String usuario = "user";
    static String pswUsuario = "sistema";
    static String admin = "admin";
    static String pswAdmin = "PRN2";

    //Metodo para iniciar sesión
    public static boolean iniciarSesion(String us, String pswUs, String adm, String pswAdm) 
    {
        //Valida credenciales y muestra formulario Registro
        if (us.equals(Sesion.usuario) && pswUs.equals(Sesion.pswUsuario)) 
        {
            Registro sistema = new Registro();
            sistema.setVisible(true);
            JOptionPane.showMessageDialog(null, " Encargado del sistema: Usuario. ");
            // Habilita acciones exclusivas de Usuario
            sistema.txtPrecioU.setEnabled(true);
            sistema.txtCantidad.setEnabled(true);
            sistema.btnRegistrar.setEnabled(true);
            sistema.btnLimpiar.setEnabled(true);
            sistema.btnModificar.setEnabled(false);
            sistema.btnBuscar.setEnabled(false);
            sistema.btnEliminar.setEnabled(false);
            return true;
        } 
        else 
        {
            if(adm.equals(Sesion.admin) && pswAdm.equals(Sesion.pswAdmin))
            {
                Registro sistema = new Registro();
                sistema.setVisible(true);
                JOptionPane.showMessageDialog(null, " Encargado del sistema: Administrador. ");
                sistema.limpiar();
            // Habilita acciones exclusivas de Admin
                sistema.txtPrecioU.setEnabled(false);
                sistema.txtCantidad.setEnabled(false);
                sistema.btnRegistrar.setEnabled(false);
                sistema.btnLimpiar.setEnabled(false);
                sistema.btnModificar.setEnabled(true);
                sistema.btnBuscar.setEnabled(true);
                sistema.btnEliminar.setEnabled(true);
                return true;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Ingrese correctamente sus credenciales");
                return false;
            }
        }
    }
}