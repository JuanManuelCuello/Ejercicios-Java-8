/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Juan Manuel
 */
public class BarcoMotor extends Barco{
    int cv;

    public BarcoMotor() {
    }

    public BarcoMotor(int cv, String matricula, int eslora, int anioFabr, String nombre, String dni, Date FechaAlq, int posicionAmarre, String barco) {
        super(matricula, eslora, anioFabr, nombre, dni, FechaAlq, posicionAmarre, barco);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "{"+super.toString() + "cv=" + cv + '}';
    }
    
    
    public void crearBarcoMotor(){
        super.crearBarcoPuerto();
        super.crearBarco1();
        System.out.println("cv");
        cv = leer.nextInt();
        
    }
    
    public double calcularAlquiler() {
        return (super.calcularDias()*super.calcularModulo())+cv;         
    }
    
    
}
