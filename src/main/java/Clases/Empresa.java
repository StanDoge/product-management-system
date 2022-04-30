package Clases;

import Interfaces.Proceso;

import javax.swing.*;

/**
 * @author Stanley
 */
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
     * Genera un arreglo de productos, los valores de sus atributos provienen desde el formulario.
     *
     * @param nombreProducto nombre del producto.
     * @param marcaProducto  marca creadora del producto.
     * @param tipoProducto   clasidicacion del electrodomestico.
     * @param precio         precio unitario del producto, sin impuestos.
     * @param empresa        empresa duena de la marca del electrodomestico.
     * @param cantidad       cantidad de replicas del producto con las mismas caracteristicas.
     * @return arreglo de longitud <>cantidad</> del tipo <>Electrodomestico</>.
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


