package poo.servicios.Nesspresso;

import java.util.Scanner;
import poo.entidades.cafetera.Cafetera;

public class NespressoServicio {

    private Scanner leer = new Scanner(System.in);
    

    public Cafetera crearCafetera() {

        Cafetera nespresso = new Cafetera();
        System.out.println("Ingrese la capacidad maxima de la cafetera");
        nespresso.setMaxima(leer.nextInt());

        System.out.println("ingrese la cantidad actual de cafe");
        nespresso.setActual(leer.nextInt());
        return nespresso;
    }

    public void llenarCafetera(Cafetera nespresso) {

        nespresso.setActual(nespresso.getMaxima());
        System.out.println("Cafetera llena");
    }

    public Cafetera servirTaza(Cafetera nespresso) {

        System.out.println("Que tamaño de taza va a utilizar");
        int taza = leer.nextInt();
        int resto = 0;
        if (nespresso.getActual() < taza) {
            System.out.println("No se lleno la taza");
            System.out.println("se ha llenado al "+(nespresso.getActual() * 100) / taza + "%");
            nespresso.setActual(0);
        } else {
            System.out.println("su taza se lleno");
            nespresso.setActual(nespresso.getActual() - taza);
        }

        return nespresso;

    }

    public void vaciasCafetera(Cafetera nespresso) {
        nespresso.setActual(0);
        System.out.println("su cafetera ha sido vaciada");

    }

    public void agregarCafe(Cafetera nespresso) {
        

        int max = nespresso.getMaxima();
        int actual = nespresso.getActual();
        int agregar = 0;
        
        if (actual<max){
            System.out.println("Cuanto cafe va a agregar?");
        do {
            agregar = leer.nextInt();

        } while ((max - actual) <= agregar);

        if ((max - actual) > agregar) {
            nespresso.setActual(nespresso.getActual() + agregar);}
        else{System.out.println("error");
        }

    } else {System.out.println("su cafetera ya está llena");}
    }
}
