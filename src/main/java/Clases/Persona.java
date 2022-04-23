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
public abstract class Persona implements Proceso
{
    int ID;
    String usuario;
    String contraseña;

    //Constructor
    public Persona(String usuario, String contraseña)
    {
        this.ID = generarID();
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    //Getters & Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
