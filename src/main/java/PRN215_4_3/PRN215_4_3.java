package PRN215_4_3;

import Clases.Electrodomestico;
import Clases.Empresa;
import Clases.Entrega;


/**
 * @author :
 *  Adam Carnet
 *  Cesar Carnet
 *  Stanley MR210083
 * */

public class PRN215_4_3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Empresa generica = new Empresa(222,"generica","Colombia");
        Electrodomestico licuadora = new Electrodomestico("generica edition",123,"Cosina", 23.83f,generica);
        Electrodomestico[] cantidadEjemplo = {licuadora};
        Entrega primeraEntrega = new Entrega(11,cantidadEjemplo);
        
        System.out.println(generica.getNombre() + licuadora.getMarca());
    }
}
