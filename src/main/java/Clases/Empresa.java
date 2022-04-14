package Clases;

public class Empresa {

    int empresaID;
    String nombre;
    String pais;
    
    //Constructor
    public Empresa(int empresaID, String nombre, String pais) {
        this.empresaID = empresaID;
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
