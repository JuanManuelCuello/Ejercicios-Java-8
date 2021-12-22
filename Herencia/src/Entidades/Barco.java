package Entidades;

import java.util.Date;
import java.util.Scanner;


public class Barco extends Puerto {
    String matricula;
    int eslora, anioFabr;

    Scanner leer = new Scanner(System.in);
    
    public Barco(String matricula, int eslora, int anioFabr, String nombre, String dni, Date FechaAlq, int posicionAmarre, String barco) {
        super(nombre, dni, FechaAlq, posicionAmarre, barco);
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabr = anioFabr;
    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabr() {
        return anioFabr;
    }

    public void setAnioFabr(int anioFabr) {
        this.anioFabr = anioFabr;
    }

    @Override
    public String toString() {
        return "{"+super.toString() + "matricula=" + matricula + ", eslora=" + eslora + ", anioFabr=" + anioFabr + '}';
    }
    
    public void crearBarco1(){
        
         
        System.out.println("Matricula:");
        matricula = leer.next();
        System.out.println("Eslora:");
        eslora = leer.nextInt();
        System.out.println("Año");
        anioFabr = leer.nextInt();
        
        
    }
    
    
     public double calcularModulo(){
         
       return eslora * 10;             
    }
    
   
    
     
}
