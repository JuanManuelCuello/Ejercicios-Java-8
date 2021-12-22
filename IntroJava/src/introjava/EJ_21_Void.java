package introjava;

import java.util.Scanner;

/**
 *
 * @author Juan Manuel
 */
public class EJ_21_Void {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de euros a cambiar: ");
        float dinero = leer.nextFloat() ; 

        conversoreuros(dinero);

    }

    public static void conversoreuros(float cantidad) {

        float euro = (float) (cantidad * 1.28611);
        System.out.println(cantidad + " euros " + "son iguales a: " + euro + " U$D");

        float libras = (float) (cantidad * 0.86);
        System.out.println(cantidad + " euros " + "son iguales a: " + libras + " L");

        float yenes = (float) (cantidad * 129.852);
        System.out.println(cantidad + " euros " + "son iguales a: " + yenes + " Y");
        
        System.out.println(" ");
    }

}
