package Clases;

import Interfaces.Proceso;

import java.time.LocalDate;

/**
 * @author Stanley
 */
public class Almacen implements Proceso {
    String nombre;
    Administrador admin;
    Entrega electrodomesticos;
    int codigoPostal;
    String direccion;
    LocalDate fechaRecibido;


    //Constructor
    public Almacen(String nombre, Administrador admin, Entrega electrodomesticos, String direccion) {
        this.nombre = nombre;
        this.admin = admin;
        this.electrodomesticos = electrodomesticos;
        this.codigoPostal = generarID();
        this.direccion = direccion;
        this.fechaRecibido = generarFecha(electrodomesticos.getFechaEnvio());
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

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
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

    public LocalDate getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(LocalDate fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }


    /**
     * Suma 5 dias a la fecha de envio dada como argumento
     *
     * @param fecha tipo LocalDate es la fecha generada en Entrega
     * @return fecha de envio + 5 dias = fecha recibido
     */
    public LocalDate generarFecha(LocalDate fecha) {
        return fecha.plusDays(5);
    }

}
