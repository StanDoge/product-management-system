package Interfaces;

import java.time.LocalDate;
import java.util.Random;

public interface Proceso {

    default LocalDate generarFecha() {
        return null;
    }

    /**
     * Creando un objeto random, se genera un numero random que puede ser negativo por lo que se obtiene su numero
     * absoluto.
     * @return un numero de serie de 6 digitos totalmente aleatorio
     */
    default int generarID() {
        Random serie = new Random();
        return Math.abs(serie.nextInt());
    }
}
