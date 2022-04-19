package Clases;

import Interfaces.Proceso;

public class Entrega implements Proceso {

    int entregaID;
    String fechaEnvio;
    int cantidadElectrodomesticos;

    //Contructor
    public Entrega(int entregaID, Electrodomestico[] cantidadElectrodomesticos) {
        this.entregaID = entregaID;
        //TODO: definir que algoritmo usa para generar id's
        this.fechaEnvio = generarFecha();
        this.cantidadElectrodomesticos = cantidadElectrodomesticos.length;
    }

    //Getters & Setters
    public int getEntregaID() {
        return entregaID;
    }

    public void setEntregaID(int entregaID) {
        this.entregaID = entregaID;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getCantidadElectrodomesticos() {
        return cantidadElectrodomesticos;
    }

    public void setCantidadElectrodomesticos(int cantidadElectrodomesticos) {
        this.cantidadElectrodomesticos = cantidadElectrodomesticos;
    }


}
