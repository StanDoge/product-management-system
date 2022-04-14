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
        
        
        Empresa generica = new Empresa(222,"Generica","Colombia");
        Electrodomestico licuadora = new Electrodomestico("Generica Edition",12323,"Cocina", 23.83f,generica);
        Electrodomestico refri = new Electrodomestico("Yummy meals",132323,"Cocina", 100.40f,generica);
        Electrodomestico cocina  = new Electrodomestico("Uwu",13323,"Cocina", 89.99f,generica);
        Electrodomestico[] cantidadEjemplo = {licuadora,refri,cocina};
        Entrega primeraEntrega = new Entrega(11,cantidadEjemplo);

        /*
          Usar String Interpolation hace mas legible  y facil al momento de imprimir data, propongo usarlo como
          convencion en el proyecto en lugar de ir sumando uno por uno cada variable.

          %s = variables de tipo stirng
          %d = varibles de tipo numerico
        */
        System.out.printf("La empresa %s es duena del stock de longitud %d , lleno de productos del tipo %s%n",
                generica.getNombre(), primeraEntrega.getCantidadElectrodomesticos(), licuadora.getTipo());
    }
}
