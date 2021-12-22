package poo.principal.EJ5;

import java.util.Scanner;
import poo.entidades.Cuenta.Cuenta;
import poo.servicios.cuenta.CuentaServicio;

public class EJ_5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CuentaServicio cuentaservicio = new CuentaServicio();
       // Cuenta cuenta = new Cuenta();

        System.out.println("-- [Bienvenido al Banco] --");
        System.out.println("");
                
        int selec = 1;

        Cuenta a1 = cuentaservicio.crearCuenta();

        System.out.println(" 1  - Ingresar ");
        System.out.println(" 2  - Retirar ");
        System.out.println(" 3  - Extraccion Rápida");
        System.out.println(" 4  - Consultar Saldo");
        System.out.println(" 5  - Consultar Datos");
        System.out.println(" 6  - Salir");

        do {
            System.out.println("");
            System.out.println("-- Seleccione una opción --");
            System.out.println("");
            selec = leer.nextInt();
            System.out.println("");

            switch (selec) {

                case 1:
                    cuentaservicio.ingresar(a1);
                    System.out.println("");
                    break;
                case 2:
                    cuentaservicio.retiro(a1);
                    System.out.println("");
                    break;
                case 3:
                    cuentaservicio.extracciónRapida(a1);
                    System.out.println("");
                    break;
                case 4:
                    cuentaservicio.consultarSaldo(a1);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println(a1);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;

            }
        } while (selec != 6);

    }

}
