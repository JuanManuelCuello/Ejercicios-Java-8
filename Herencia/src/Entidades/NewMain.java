/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Juan Manuel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("=========Fecha de alquiler======");
        System.out.println("Ingrese día:");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes:");
        int mes = leer.nextInt();
        mes = mes - 1;
        System.out.println("Ingrese año:");
        int anio = leer.nextInt();
        anio = anio - 1900;

        Date fecha1 = new Date(anio, mes, dia);

        System.out.println("=========Fecha de devolucion======");
        System.out.println("Ingrese día:");
        dia = leer.nextInt();
        System.out.println("Ingrese mes:");
        mes = leer.nextInt();
        mes = mes - 1;
        System.out.println("Ingrese año:");
        anio = leer.nextInt();
        anio = anio - 1900;

        Date fecha2 = new Date(anio, mes, dia);
        
        long dife = fecha2.getTime()-fecha1.getTime();
        
        System.out.println(dife /(3600000*24));
       ;
        
    }
 
    
    
    
    
    
    
}
