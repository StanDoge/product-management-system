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
 * @author César
 */
public class Usuario extends Persona implements Proceso {
    public Usuario(String usuario) {
        this.ID = generarID();
    }

    public void consultarProducto() {
        //...
    }

    /**
     * Envio desde el arreglo de productos hasta la tabla del formulario
     *
     * @param e arreglo de electrodomesticos para obtener los valores de sus atributos
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

    public Electrodomestico[] generarProducto(String nombreProducto, String marcaProducto, String tipoProducto,
                                              float precio, Empresa empresa, int cantidad) {

        Electrodomestico[] stockProductos = null;
        try {
            stockProductos = new Electrodomestico[cantidad];
            for (int i = 0; i < cantidad; i++) {
                Electrodomestico productos = new Electrodomestico(nombreProducto, marcaProducto, generarID(),
                        tipoProducto, precio, empresa);
                productos.calcularTotal(cantidad);
                stockProductos[i] = productos;
            }

        } catch (NegativeArraySizeException sms) {
            JOptionPane.showMessageDialog(null, "La cantidad de productos no puede ser negativa",
                    "Error"
                    , JOptionPane.ERROR_MESSAGE);
        }
        return stockProductos;
    }

}

