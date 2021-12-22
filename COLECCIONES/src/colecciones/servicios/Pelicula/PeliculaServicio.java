package colecciones.servicios.Pelicula;

import colecciones.entidades.Pelicula.Pelicula;
import colecciones.utilidades.Pelicula.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPelicula = new ArrayList();
    //Comparadores comparadores = new Comparadores();

    public Pelicula crearPelicula() {

        System.out.println("Ingrese el Titulo");

        Pelicula peli = new Pelicula();
        peli.setTitulo(leer.next());

        System.out.println("Ingrese el Director");
        peli.setDirector(leer.next());

        System.out.println("Ingrese la duración");
        peli.setDuracion(leer.nextInt());

        return peli;

    }

    public void agregarPelicula(Pelicula a) {
        listaPelicula.add(a);
    }

    public void mostrarPeliculas() {

        for (Pelicula a : listaPelicula) {
            System.out.println(a);

        }
    }

    public void mostrarPeliculasMas1H() {

        for (Pelicula a : listaPelicula) {
            if (a.getDuracion() >= 60) {
                System.out.println(a);
            }
        }
    }

    public void ordenDescendete() {
        Collections.sort(listaPelicula, Comparadores.ordenarHora);

    }

    public void ordenAscendente() {
        Collections.sort(listaPelicula, Comparadores.ordenarHoraDes);
    }

    public void ordenTitulo(){
        Collections.sort(listaPelicula, Comparadores.ordenarTitulo);
    }
    
    public void ordenDirector(){
        Collections.sort(listaPelicula, Comparadores.ordenarDirector);
    }
    
    
}
