package poo.servicios.Puntos;

import java.util.Scanner;
import poo.entidades.Puntos.Puntos;

public class PuntosServicio {

   


    private Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
         
        Puntos puntos = new Puntos();
        
        System.out.println("Ingrese las coordenadas para el punto 1, primero -x- luego -y-");

        puntos.setX1(leer.nextInt());
        puntos.setY1(leer.nextInt());

        System.out.println("Ingrese las coordenadas para el punto 2, primero -x- luego -y-");

        puntos.setX2(leer.nextInt());
        puntos.setY2(leer.nextInt());

        return puntos;
    }

    public double calcularPuntos(Puntos puntos) {

        double distancia = Math.sqrt(((puntos.getX2() - puntos.getX1()) ^ 2) + ((puntos.getY2() - puntos.getY1()) ^ 2));

        return distancia;
    }

}
