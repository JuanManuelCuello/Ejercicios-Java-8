package poo.principal.EJ1;

import java.util.Scanner;
import poo.entidades.libro.Libro;

public class Ej_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Libro libro = new Libro();

        System.out.println("Ingrese el ISBN");
        libro.setISBN(leer.next());

        System.out.println("Ingrese el nombre del libro");
        libro.setTitulo(leer.next());

        System.out.println("Ingrese el autor");
        libro.setAutor(leer.next());

        System.out.println("Número de página");
        libro.setNumeroPagina(leer.nextInt());

        System.out.println("" + libro.toString());

    }

}
