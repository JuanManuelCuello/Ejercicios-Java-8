package poo.principal.EJ11;

import java.util.Date;
import java.util.Scanner;

public class EJ11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
             

        System.out.println("Ingrese día:");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes:");
        int mes = leer.nextInt();
        mes = mes - 1;
        System.out.println("Ingrese año:");
        int anio = leer.nextInt();
        anio = anio - 1900;

        Date fecha = new Date(anio,mes,dia);

        System.out.println(fecha);

        Date actual = new Date();

        System.out.println(actual);
        
        System.out.println("la diferencias de años es: ");
        System.out.println(fecha.getYear()-actual.getYear());
        
        
        
    }

}
