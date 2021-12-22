package colecciones.principal.EJ3;

import colecciones.entidades.Alumno.Alumno;
import colecciones.servicios.Alumno.AlumnoServicio;
import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {
        String seguir;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AlumnoServicio serv = new AlumnoServicio();

        do {
            Alumno a = serv.crearAlummno();
            serv.agregarAlumno(a);
            System.out.println("Desea agregar mas alumnos? s/n");
            seguir = leer.next();
        } while ("s".equals(seguir));

        System.out.println("Ingrese el nombre del alumno que quiera calcular su nota final");
        String nomb;

        int cont = 0;

        
        do {
            nomb = leer.next();
            if (serv.contieneAlumno(nomb)) {
                System.out.println("El Promedio es de " + serv.notaFinal(nomb));
                break;
            } else {
                System.out.println("no existe el alumno ingresado");
            }

        } while (true);
    }
}
