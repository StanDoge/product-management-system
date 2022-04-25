/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Proceso;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author César
 */
public class Usuario extends Persona implements Proceso
{
    public Usuario(String usuario, String contraseña) 
    {
        super(usuario, contraseña);
        this.ID = generarID();
    }
    
    public void consultarProducto()
    {
        //...
    }
    
}

