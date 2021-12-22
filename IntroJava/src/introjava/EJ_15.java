package introjava;

import java.util.Scanner;

public class EJ_15 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");

        boolean exit = false;
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int menu = 0;
        String salir = "r";

        System.out.println("");
        System.out.println("--- MENU ---");
        System.out.println("");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("");
        System.out.println("--- Elija una opcion ---");
        System.out.println("");

        do {
            menu = leer.nextInt();
            float aux = 0;
            switch (menu) {
                case 1:
                    aux = num1 + num2;
                    System.out.println("La suma de los numeros es: " + aux);
                    break;
                case 2:
                    aux = num1 - num2;
                    System.out.println("La resta de los numeros es: " + aux);
                    break;

                case 3:
                    aux = num1 * num2;
                    System.out.println("La multiplicacion de los numeros es: " + aux);
                    break;

                case 4:
                    aux = num1 / num2;
                    System.out.println("La division de los numeros es: " + aux);
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa S/N?");
                    salir = leer.next();
                    // System.out.println(salir);
                    if (salir.equals("s")) {
                        exit = true;
                    }

                    //  System.out.println(exit);
                    break;

                default:
                    System.out.println("las opciones son entre 1 y 5");

            }
        } while (exit == false);

    }

}
