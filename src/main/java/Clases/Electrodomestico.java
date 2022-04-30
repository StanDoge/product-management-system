package Clases;


import Interfaces.Proceso;

/**
 * @author Stanley
 */

public class Electrodomestico implements Proceso {
    String nombre;
    final float IVA = 0.13f;
    String marca;
    int nSerie;
    String tipo;
    float precio;
    float precioTotal;
    Empresa propietario;

    //Constructor
    public Electrodomestico(String nombre, String marca, int nSerie, String tipo, float precio, Empresa propietario) {
        this.nombre = nombre;
        this.marca = marca;
        this.nSerie = generarID();
        this.tipo = tipo;
        this.precio = precio;
        this.propietario = propietario;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getnSerie() {
        return nSerie;
    }

    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getIVA() {
        return IVA;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Empresa getPropietario() {
        return propietario;
    }

    public void setPropietario(Empresa propietario) {
        this.propietario = propietario;
    }

    /**
     * Calcula el precio total del stock de un tipo de producto. Usando su precio unitario + IVA por la cantidaad
     * de productos del arreglo.
     *
     * @param cantidad cantidad total de productos a los cuales se les aplicara IVA y sumaran sus precios finales.
     */
    public void calcularTotal(int cantidad) {
        this.precioTotal = (this.precio + (this.precio * IVA)) * cantidad;
    }
}
