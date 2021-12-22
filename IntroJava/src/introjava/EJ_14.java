package introjava;

import java.util.Scanner;

public class EJ_14 {

    public static void main(String[] args) {

        int aux = 0;
        int num = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un numero que represente el limite positivo");

        int limite = leer.nextInt();

        do {
            System.out.println("Ingrese los numeros para sumar para superar el limite");
            num = leer.nextInt();
            aux = aux + num;

        } while ( aux <= limite);

        System.out.println("El limite elegido es |" + limite + "| y lo hemos superado con el numero |" + aux + "|");

    }

}
