package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Puerto {

    protected String nombre, dni;
    Date FechaAlq, FechaDev;
    int posicionAmarre;
    String barco;

    Scanner leer = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaAlq() {
        return FechaAlq;
    }

    public void setFechaAlq(Date FechaAlq) {
        this.FechaAlq = FechaAlq;
    }

    public Date getFechaDev() {
        return FechaDev;
    }

    public void setFechaDev(Date FechaDev) {
        this.FechaDev = FechaDev;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public String getBarco() {
        return barco;
    }

    public void setBarco(String barco) {
        this.barco = barco;
    }

    public Puerto(String nombre, String dni, Date FechaAlq, int posicionAmarre, String barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.FechaAlq = FechaAlq;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public Puerto() {
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", dni=" + dni + ", FechaAlq=" + FechaAlq + ", FechaDev=" + FechaDev + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }

    public double calcularDias() {
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
        FechaAlq = fecha1;
        
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
        FechaDev = fecha2;
        
        long dife = fecha2.getTime()-fecha1.getTime();
        
        return dife /(3600000*24);
    }

    public void crearBarcoPuerto() {
        System.out.println("Nombre:");
        nombre = leer.next();

        System.out.println("DNI");
        dni = leer.next();

       

        System.out.println("Posición de amarre");
        posicionAmarre = leer.nextInt();

        System.out.println("Ingrese un tipo de barco");
        System.out.println("a - barco motor");
        System.out.println("b - velero");
        System.out.println("c - yate de lujo");
        
        barco = leer.next();
        
        
    }

}
