package introjava;

import java.util.Scanner;

public class EJ_23_Arreglo_Buscar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Defina el tamaño del arreglo");
        int longi = leer.nextInt();

        int[] b = new int[longi];

        llenarvector(b);
        mostrar(b);
        
        System.out.println(" ");
        System.out.println("Ingrese un numero a buscar");
        System.out.println(" ");
        
        int buscar = leer.nextInt();
        
        buscar(b,buscar);
    }

    public static void llenarvector(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
    }

    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i] + " ");
        }
    }

    public static void buscar(int[] vector,int busc) {
        int cont=0;
        for (int i = 0; i < vector.length - 1; i++) {
            
            if (busc== vector[i]){
                System.out.println("Se encontro el numero -"+busc+ "- en la posicion "+ (i+1) );
                cont++;
            }
            }
            System.out.println("El numero se repite "+cont+" veces");
        }

    }
