/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Proceso;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;

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
    public static void registrarProducto(Electrodomestico[] e, Empresa em,  Almacen local, JTable table)
    {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        DecimalFormat formater = new DecimalFormat();

        for (Electrodomestico p : e){

            String[] fila = new String[10];

            fila[0] = Integer.toString(p.getnSerie());
            fila[1] = p.getNombre();
            fila[2] = p.getTipo();
            fila[3] = p.getMarca();
            fila[4] = Float.toString(p.getPrecio());
            fila[5] = Float.toString(Math.round(p.getPrecioTotal()));
            fila[6] = em.getNombre();
            fila[7] = em.getPais();
            fila[8] = local.admin.getUsuario();
            fila[9] = local.getFechaRecibido().toString();
            modelo.addRow(fila);

        }
    }

}

