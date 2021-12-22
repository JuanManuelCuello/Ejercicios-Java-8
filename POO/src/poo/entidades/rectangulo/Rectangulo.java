package poo.entidades.rectangulo;

import java.util.Scanner;

public class Rectangulo {

    private int base, altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese altura y luego la base");
        Scanner leer = new Scanner(System.in);
        this.altura = leer.nextInt();
        this.base = leer.nextInt();
    }

    public int calcularSuperficie() {

        int superficie = base * altura;

        return superficie;

    }

    public int calcularPerimetro() {
        int perimetro = (base + altura) * 2;
        return perimetro;

    }

    public void dibujar() {

        ///SUperior
        for (int i = 0; i < base ; i++) {

            System.out.print("*");
        }
        System.out.println();

        //Medio
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < base - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        ///base
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }

}
