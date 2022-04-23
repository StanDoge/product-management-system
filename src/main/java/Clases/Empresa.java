package Clases;

import Interfaces.Proceso;

public class Empresa implements Proceso {

    int empresaID;
    String nombre;
    String pais;
    
    //Constructor
    public Empresa(String nombre, String pais) {
        this.empresaID = generarID();
        this.nombre = nombre;
        this.pais = pais;
    }
    
   //Getters & Setters
    public int getEmpresaID() {
        return empresaID;
    }

    public void setEmpresaID(int empresaID) {
        this.empresaID = empresaID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
