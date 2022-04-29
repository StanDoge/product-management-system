package Clases;

import Interfaces.Proceso;

import javax.swing.*;

public class Empresa implements Proceso {

    int empresaID;
    String nombre;
    String pais;

    //Constructor
    public Empresa(String nombre, String pais) {
        this.empresaID = generarID();
        this.nombre = nombre;
        this.pais = pais;
    }

    //Getters & Setters
    public int getEmpresaID() {
        return empresaID;
    }

    public void setEmpresaID(int empresaID) {
        this.empresaID = empresaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Crea una arreglo de un tipo de electrodomestico.
     *
     * @param precio:   precio unitario
     * @param cantidad: cantidad de objetos que estaran dentro del arreglo
     * @return un arreglo de Electrodomesticos
     */
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


