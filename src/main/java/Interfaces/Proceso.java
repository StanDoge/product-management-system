package Interfaces;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface Proceso {
    //Todos los metodos por defecto son public

    default void calcularTotal() {
       //...
    }

    default String generarFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); /* Necesario para simplificar la manera
        en que la fecha se muestra */
        Date today = new Date();
        return sdf.format(today);
    }
}
