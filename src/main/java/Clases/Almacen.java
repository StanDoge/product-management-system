package Clases;

import Interfaces.Calculos;

public class Almacen implements  Calculos{
    String nombre;
    String admin;
    int codigoPostal;
    String direccion;
    String fechaRecibido;
    float costoAlmacenamiento;

    //Constructor

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public float getCostoAlmacenamiento() {
        return costoAlmacenamiento;
    }

    public void setCostoAlmacenamiento(float costoAlmacenamiento) {
        this.costoAlmacenamiento = costoAlmacenamiento;
    }
}
