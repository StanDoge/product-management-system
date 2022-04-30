package Clases;

import Interfaces.Proceso;

import java.time.LocalDate;

public class Entrega implements Proceso {

    int entregaID;
    LocalDate fechaEnvio;
    int cantidadElectrodomesticos;

    Empresa empresa;

    //Contructor
    public Entrega(Empresa empresa, Electrodomestico[] cantidadElectrodomesticos) {
        this.entregaID = generarID();
        this.fechaEnvio = generarFecha();
        this.empresa = empresa;
        this.cantidadElectrodomesticos = cantidadElectrodomesticos.length;
    }

    //Getters & Setters
    public int getEntregaID() {
        return entregaID;
    }

    public void setEntregaID(int entregaID) {
        this.entregaID = entregaID;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getCantidadElectrodomesticos() {
        return cantidadElectrodomesticos;
    }

    public void setCantidadElectrodomesticos(int cantidadElectrodomesticos) {
        this.cantidadElectrodomesticos = cantidadElectrodomesticos;
    }

    /**
     * Genera la fecha de salida del stock de productos de una empresa X.
     *
     * @return objeto LocalDate con la fecha.
     */
    @Override
    public LocalDate generarFecha() {
        LocalDate today = LocalDate.now();
        return today;
    }
}
