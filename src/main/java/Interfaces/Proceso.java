package Interfaces;

import java.time.LocalDate;
import java.util.Random;

public interface Proceso {

    /**
     * Hace un "timestamp" pero solo con la fecha, no hora
     *
     * @return fecha del momento que el metodo se ejecuta en tipo String y con un formato ISO, mucho mas legible
     * que el original del objeto Date
     * @author Stanley
     */
    default LocalDate generarFecha() {
        return null;
    }

    /**
     * Creando un objeto random, se genera un numero random que puede ser negativo por lo que se obtiene su numero
     * absoluto.
     *
     * @return un numero de serie de 6 digitos totalmente aleatorio
     */

    default int generarID() {
        Random serie = new Random();
        return Math.abs(serie.nextInt());
    }
}
