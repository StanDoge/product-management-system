package Clases;

public class Electrodomestico {
    String marca;
    int nSerie;
    String tipo;
    boolean estado;
    final float IVA = 0.13f;
    float precio;
    float precioTotal;

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
}
