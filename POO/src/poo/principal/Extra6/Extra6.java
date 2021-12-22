package poo.principal.Extra6;

import poo.entidades.ahorcado.Ahorcado;
import poo.servicios.Ahorcado.AhorcadoServicio;

public class Extra6 {

    public static void main(String[] args) {

        AhorcadoServicio ahorcadoservicio = new AhorcadoServicio();

        Ahorcado Pj1 = ahorcadoservicio.crearJuego();
        System.out.println("");
        ahorcadoservicio.longitud(Pj1);
        do {

            System.out.println("");
            ahorcadoservicio.encontradas(Pj1);
            System.out.println("");
            ahorcadoservicio.intentos(Pj1);
            System.out.println("----------");
          
            
            
        } while  (Pj1.getLetrasEncontradas() != ahorcadoservicio.longitud(Pj1)   || Pj1.getJuagadasMaximas() != ahorcadoservicio.intentos(Pj1));

        
        
        if (Pj1.getLetrasEncontradas() == ahorcadoservicio.longitud(Pj1)){
            System.out.println("Felicidades adivino la palabra");
        }
        else {
            System.out.println("Acabó con los intentos");
        }
                
    }

}
