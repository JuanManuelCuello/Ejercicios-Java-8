package poo.servicios.RacicesServicio;

import java.util.Scanner;
import poo.entidades.raices.Raices;

public class RaicesServicio {

    private Scanner leer = new Scanner(System.in);

    public Raices crearEcuacion() {
        System.out.println("Ingrese el valor a, b, c");
        Raices raices = new Raices();

        raices.setA(leer.nextDouble());
        raices.setB(leer.nextDouble());
        raices.setC(leer.nextDouble());

        return raices;
    }

    public double getDiscriminante(Raices raices) {

        double A = raices.getA();
        double B = raices.getB();
        double C = raices.getC();

        double discriminante = (B * B) - 4 * A * C;

        return discriminante;
    }

    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }

    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }
    
    public void obtenerRaices(Raices raices) {
        
       
        
        float a = (float) raices.getA();
        float b = (float) raices.getB();
        float c = (float) raices.getC();
        
        float resMas = 0;
        float resMen = 0;
        
        if (tieneRaices(raices)==true){
        
         resMas = (float) (-b+Math.sqrt(getDiscriminante(raices))/2*a);
         resMen = (float) (-b-Math.sqrt(getDiscriminante(raices))/2*a);
        
        //if (!Float.isNaN(resMas)) {
          //  System.out.println(resMas);
            //System.out.println("Resta= "+resMen);  
            //System.out.println("Suma= "+resMas);
          
        }
       
        
        System.out.println(resMas); 
        System.out.println(resMen); 
        
    }

    public void obtenerRaiz (Raices raices){
        float a = (float) raices.getA();
        float b = (float) raices.getB();
        float c = (float) raices.getC();
                        
        float resMas = (float) (-b+Math.sqrt(getDiscriminante(raices))/2*a);
        float resMen = (float) (-b-Math.sqrt(getDiscriminante(raices))/2*a);
        float retu=0;
        
        System.out.println(resMas);
        System.out.println(resMen);
        
    } 
            
    public void calcular (Raices raices){
                  
        if (this.tieneRaices(raices)==true){
            obtenerRaices(raices);
        }
        else if (this.tieneRaiz(raices)==true){
            this.obtenerRaiz(raices);
        }
            else {System.out.println("No tiene solucion");}
            
        }
        
        
    }  
        
    
            
        
        
    
    
    
     
    

