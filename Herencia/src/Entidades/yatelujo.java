package Entidades;

import java.util.Date;

public class yatelujo extends BarcoMotor {
    
    int camarotes;

    public yatelujo() {
    }

    public yatelujo(int camarotes, int cv, String matricula, int eslora, int anioFabr, String nombre, String dni, Date FechaAlq, int posicionAmarre, String barco) {
        super(cv, matricula, eslora, anioFabr, nombre, dni, FechaAlq, posicionAmarre, barco);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "yatelujo{"+super.toString() + "camarotes=" + camarotes + '}';
    }  
    
    
    
    public void crearBarcoYate(){
        super.crearBarcoMotor();
        System.out.println("Numero de camarotes");
        camarotes = leer.nextInt();
    }
    
    
    
    
    @Override
    public double calcularAlquiler() {
        return (super.calcularDias()*super.calcularModulo())+cv+camarotes;         
    }
    
}
