
package Entidades;

import java.util.Date;


public class Veleros extends Barco{

    public Veleros(int nroMastiles, String matricula, int eslora, int anioFabr, String nombre, String dni, Date FechaAlq, int posicionAmarre, String barco) {
        super(matricula, eslora, anioFabr, nombre, dni, FechaAlq, posicionAmarre, barco);
        this.nroMastiles = nroMastiles;
    }

    public Veleros() {
    }
    int nroMastiles;

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return "Veleros{"+super.toString() + "nroMastiles=" + nroMastiles + '}';
    }
    
    
    public void crearBarcoVelero(){
        super.crearBarcoPuerto();
        super.crearBarco1();
        System.out.println("Mastiles:");
        nroMastiles = leer.nextInt();
        
        
    }
    
    
    public double calcularAlquiler() {
        return (super.calcularDias()*super.calcularModulo())+nroMastiles;         
    }
    
    
    
    
    
    
    
}
