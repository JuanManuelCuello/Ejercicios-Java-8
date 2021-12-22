package colecciones.servicios.Alumno;

import colecciones.entidades.Alumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> listaAlumnos = new ArrayList();

    public Alumno crearAlummno() {

        String nomb;
        String seguir;

        System.out.println("Ingrese el nombre");

        Alumno alumno1 = new Alumno();
        nomb = leer.next();
        alumno1.setNombre(nomb);

        System.out.println("Ingrese la nota 1");
        int nota1 = leer.nextInt();

        System.out.println("Ingrese la nota 2");
        int nota2 = leer.nextInt();

        System.out.println("Ingrese la nota 3");
        int nota3 = leer.nextInt();

        alumno1.getNotas().add(nota1);
        alumno1.getNotas().add(nota2);
        alumno1.getNotas().add(nota3);

        return alumno1;

    }

    public void agregarAlumno(Alumno a) {
        listaAlumnos.add(a);
    }

    public boolean contieneAlumno(String nomb){
        
        for (Alumno a : listaAlumnos) {
           if (nomb.equals(a.getNombre())) {
              return true; 
               
           }
            
        }
    return (false);    
    }
    
    
    public int notaFinal(String nomb) {
     //   System.out.println("Ingrese el nombre del alumno que quiera calcular su nota final");
    //    String nomb = leer.next();
        int suma = 0;

        for (Alumno a : listaAlumnos) {
            if (nomb.equals(a.getNombre())) {
                for (Integer nota : a.getNotas()) {
                    suma += nota ;
                }
            }
        }
        return (suma / 3);

    }

  
}
