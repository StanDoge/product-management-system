package Clases;

import Interfaces.Proceso;

public class Almacen implements Proceso {
    String nombre;
    String admin;
    Entrega electrodomesticos;
    int codigoPostal;
    String direccion;
    String fechaRecibido;


    //Constructor
    public Almacen(String nombre, String admin, Entrega electrodomesticos, String direccion) {
        this.nombre = nombre;
        this.admin = admin;
        this.electrodomesticos = electrodomesticos;
        this.codigoPostal = generarID();
        this.direccion = direccion;
        //this.fechaRecibido = fechaRecibido;
        //todo: intefaz de fechas
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

    //Operaciones

    @Override
    public String generarFecha(){
        return  null;////
        //TODO: sumar dias
    }
}
