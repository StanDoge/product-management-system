package Clases;

import Formularios.Registro;

import javax.swing.*;

import static Formularios.Registro.*;

/**
 * @author Cesar
 */
public abstract class Sesion {
    static String usuario = "user";
    static String pswUsuario = "sistema";
    static String admin = "admin";
    static String pswAdmin = "PRN2";

    static Registro sistema = new Registro();

    /**
     * Comprueba que las credenciales permitidas y las otorgadas por la persona que esta ingresando al sistema sean las
     * correctas.
     *
     * @param us     nombre identificador del rol usuario.
     * @param pswUs  contrasenia del rol usuario.
     * @param adm    nombre identificador del rol administrador.
     * @param pswAdm contrasenia del rol administrador.
     * @return dato de tipo boolean que indica si las credencias entregadas coonciden o no con las definidas
     * en la clase Sesion.
     */
    public static boolean iniciarSesion(String us, String pswUs, String adm, String pswAdm) {
        //Valida credenciales y muestra formulario Registro
        if (us.equals(Sesion.usuario) && pswUs.equals(Sesion.pswUsuario)) {
//            Registro sistema = new Registro();
            sistema.setVisible(true);
            // Habilita acciones exclusivas de Usuario
            txtPrecioU.setEnabled(true);
            txtCantidad.setEnabled(true);
            btnRegistrar.setEnabled(true);
            btnLimpiar.setEnabled(true);
            btnModificar.setEnabled(false);
            btnBuscar.setEnabled(false);
            btnEliminar.setEnabled(false);
            return true;
        } else {
            if (adm.equals(Sesion.admin) && pswAdm.equals(Sesion.pswAdmin)) {
                // Habilita acciones exclusivas de Admin
                sistema.setVisible(true);
                txtPrecioU.setEnabled(false);
                txtCantidad.setEnabled(false);
                btnRegistrar.setEnabled(false);
                btnLimpiar.setEnabled(false);
                btnModificar.setEnabled(true);
                btnBuscar.setEnabled(true);
                btnEliminar.setEnabled(true);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese correctamente sus credenciales");
                return false;
            }
        }
    }
}