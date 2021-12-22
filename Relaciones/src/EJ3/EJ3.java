package EJ3;

import EJ3.entidades.Baraja;
import EJ3.entidades.Cartas;
import java.util.ArrayList;
import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        ArrayList<Cartas> descarte = new ArrayList();
        ArrayList<Cartas> mazo = new ArrayList();
        Scanner leer = new Scanner(System.in);

        baraja.crearMazo();

        String seg = "A";
        int opc = 920;
        System.out.println("--BARAJA ESPAÑOLA--");
        System.out.println("1- Barajar");
        System.out.println("2- Siguente carta");
        System.out.println("3- Numero de cartas Disponibles");
        System.out.println("4- Dar cartas, ingrese un numero");
        System.out.println("5- Mostrar Descarte");
        System.out.println("6- Mostrar cartas restantes");
        System.out.println("7- Salir");
        boolean band = true;
        opc = 20;

        while (opc != 7) {
            System.out.println("");
            System.out.println("-- Seleccione una opción --");
            System.out.println("");
            opc = leer.nextInt();
            System.out.println("");

            switch (opc) {

                case 1:
                    baraja.Barajar();
                    break;
                case 2:
                    do {
                        baraja.siguienteCarta();
                        System.out.println("Desea una carta mas S/N");
                        seg = leer.next().toUpperCase();
                    } while (seg.equals("S"));
                    break;
                case 3:
                    baraja.cartasDisponibles();
                    break;
                case 4:
                    baraja.darCartas();
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
        }

    }

}
