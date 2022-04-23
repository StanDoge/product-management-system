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
public abstract class Persona 
{
    String usuario;
    String contraseña;
    
    public Persona(String usuario, String contraseña)
    {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
}
