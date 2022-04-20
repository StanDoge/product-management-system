package Clases;


import Interfaces.Proceso;

public class Electrodomestico implements Proceso {

    final float IVA = 0.13f;
    String marca;
    int nSerie;
    String tipo;
    boolean estado = true;
    float precio;
    float precioTotal;
    Empresa propietario;

    //Constructor
    public Electrodomestico(String marca, int nSerie, String tipo, float precio, Empresa propietario) {
        this.marca = marca;
        this.nSerie = generarID();
        this.tipo = tipo;
        this.precio = precio;
        this.propietario = propietario;
    }

    //Getters & Setters
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    //metodos

    /**
     * Inicializa el valor del atributo precioTotal sumando el valor del precio unitario + el IVA de dicho precio
     * @author Stanley
     */

    public void calcularTotal(){
        this.precioTotal = this.precio + (this.precio * IVA);
    }
}
