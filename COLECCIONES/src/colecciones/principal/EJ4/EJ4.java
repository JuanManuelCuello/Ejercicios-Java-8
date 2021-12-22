package colecciones.principal.EJ4;

import colecciones.entidades.Pelicula.Pelicula;
import colecciones.servicios.Pelicula.PeliculaServicio;
import java.util.Scanner;

public class EJ4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        PeliculaServicio serv = new PeliculaServicio();

        String seguir;

        do {
            Pelicula a = serv.crearPelicula();
            serv.agregarPelicula(a);
            System.out.println("Desea agregar otra pelicula? s/n");
            seguir = leer.next();
        } while ("s".equals(seguir));

        System.out.println("Peliculas Inventario");
        serv.mostrarPeliculas();
        System.out.println("");

        System.out.println("-------Peliculas de mas de 1 hora---------");
        serv.mostrarPeliculasMas1H();
        System.out.println("");

        System.out.println("-------Peliculas Ordenadas por tiempo de mayor a menor---------");
        serv.ordenDescendete();
        serv.mostrarPeliculas();
        System.out.println("");

        System.out.println("-------Peliculas ordenadas por tiempo de menor a mayor---------");
        serv.ordenAscendente();
        serv.mostrarPeliculas();
        System.out.println("");

        System.out.println("-------Peliculas ordenadas por titulo Alfabeticamente---------");
        serv.ordenTitulo();
        serv.mostrarPeliculas();
        System.out.println("");

        System.out.println("-------Peliculas ordenadas por director Alfabeticamente---------");
        serv.ordenDirector();
        serv.mostrarPeliculas();

    }

}
