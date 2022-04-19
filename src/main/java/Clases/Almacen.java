package Clases;

import Interfaces.Fecha;
import Interfaces.Precio;

public class Almacen implements Precio, Fecha {
    String nombre;
    String admin;
    Entrega electrodomesticos;
    int codigoPostal;
    String direccion;
    String fechaRecibido;
    float costoAlmacenamiento;


    //Constructor
    public Almacen(String nombre, String admin, Entrega electrodomesticos, String direccion, float costoAlmacenamiento) {
        this.nombre = nombre;
        this.admin = admin;
        this.electrodomesticos = electrodomesticos;
        //this.codigoPostal = f();
        //todo: misma funcion ID
        this.direccion = direccion;
        //this.fechaRecibido = fechaRecibido;
        //todo: intefaz de fechas
        this.costoAlmacenamiento = costoAlmacenamiento;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public Entrega getElectrodomesticos() {
        return electrodomesticos;
    }

    public void setElectrodomesticos(Entrega electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
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

    //Operaciones

    @Override
    public void calcularTotal(){
        //....
    }

    @Override
    public String generarFecha(){
        return  null;////
    }
}
