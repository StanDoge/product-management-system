package Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Entrega {

    int entregaID;
    String fechaEnvio;
    int cantidadElectrodomesticos;

    //Contructor
    public Entrega(int entregaID, Electrodomestico[] cantidadElectrodomesticos) {
        this.entregaID = entregaID;
        //TODO: definir que algoritmo usa para generar id's
        this.fechaEnvio = simplificadorFecha();
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

    //Metodos

    /**
     * @return fecha del momento que el metodo se ejecuta en tipo String y con un formato ISO, mucho mas legible
     * que el original del objeto Date
     * @author Stanley
     */
    private String simplificadorFecha(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); /* Necesario para simplificar la manera
        en que la fecha se muestra */
        Date today = new Date();
        return sdf.format(today);
    }
}
