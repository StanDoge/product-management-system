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

public class Usuario extends Persona implements Proceso {
    public Usuario(String usuario) {
        this.ID = generarID();
    }

    public void consultarProducto() {
        //...
    }

    /**
     * Usando un arreglo agrega c/u de los elementos en el en la tabla para mostrar los valores de sus atributos.
     *
     * @param e     arreglo de Electrodomesticos.
     * @param em    objeto Empresa.
     * @param local objeto Almacen.
     * @param table objeto JTable donde se agregaran los valores de elementos del arreglo.
     */
    public static void registrarProducto(Electrodomestico[] e, Empresa em, Almacen local, JTable table) {
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        DecimalFormat formater = new DecimalFormat();

        for (Electrodomestico p : e) {

            String[] fila = new String[10];

            fila[0] = Integer.toString(p.getnSerie());
            fila[1] = p.getNombre();
            fila[2] = p.getTipo();
            fila[3] = p.getMarca();
            fila[4] = formater.format(p.getPrecio());
            fila[5] = formater.format(p.getPrecioTotal());
            fila[6] = em.getNombre();
            fila[7] = em.getPais();
            fila[8] = local.admin.getNombre();
            fila[9] = local.getFechaRecibido().toString();
            modelo.addRow(fila);

        }

    }


}

