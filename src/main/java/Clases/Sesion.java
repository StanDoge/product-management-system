/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author César
 */
public class Sesion 
{
    String usuario;
    String pswUsuario;
    String admin;
    String pswAdmin;

    public Sesion(String usuario, String pswUsuario, String admin, String pswAdmin) 
    {
        this.usuario = usuario;
        this.pswUsuario = pswUsuario;
        this.admin = admin;
        this.pswAdmin = pswAdmin;
    }
    
    private static class SesionStatic
    {
        public boolean iniciarSesion()
        {
            return true;
        }
    }
}

