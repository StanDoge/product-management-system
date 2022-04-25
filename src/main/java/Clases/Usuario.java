/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Proceso;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author César
 */
public class Usuario extends Persona implements Proceso
{
    public Usuario(String usuario)
    {
        this.ID = generarID();
    }
    
    public void consultarProducto()
    {
        //...
    }

    /**
     * Envio desde el arreglo de productos hasta la tabla del formulario
     * @param e arreglo de electrodomesticos para obtener los valores de sus atributos
     */
    public static void registrarProducto(Electrodomestico[] e, Empresa em, Administrador admin, Almacen local, JTable table)
    {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();

        for (Electrodomestico p : e){

            String[] fila = new String[10];

            fila[0] = Integer.toString(p.getnSerie());
            fila[1] = p.getNombre();
            fila[2] = p.getTipo();
            fila[3] = p.getMarca();
            fila[4] = Integer.toString(e.length);
            fila[5] = Float.toString(p.getPrecio());
            fila[6] = em.getNombre();
            fila[7] = em.getPais();
            fila[8] = admin.getUsuario();
            fila[9] = local.getFechaRecibido().toString();
            modelo.addRow(fila);

        }
    }

}

