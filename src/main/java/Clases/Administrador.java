/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Proceso;

/**
 *
 * @author César
 */
public class Administrador extends Persona implements Proceso
{
    public Administrador(String usuario, String contraseña) {
        super(usuario, contraseña);
        this.ID = generarID();
    }

    public void modficarRegistro()
    {
        //...
    }
}

