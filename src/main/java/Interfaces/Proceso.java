package Interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface Proceso {
    //Todos los metodos por defecto son public

    /**
     * Hace un "timestamp" pero solo con la fecha, no hora
     * @return fecha del momento que el metodo se ejecuta en tipo String y con un formato ISO, mucho mas legible
     * que el original del objeto Date
     * @author Stanley
     */

    default String generarFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); /* Necesario para simplificar la manera
        en que la fecha se muestra */
        Date today = new Date();
        return sdf.format(today);
    }
}
