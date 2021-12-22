package poo.servicios.cuenta;

import java.util.Scanner;
import poo.entidades.Cuenta.Cuenta;

public class CuentaServicio {

    private Scanner leer = new Scanner(System.in);

    public Cuenta cuenta = new Cuenta();

    
    public Cuenta crearCuenta() {

        System.out.println("Ingrese el numero de cuenta");
        int num = leer.nextInt();

        System.out.println("Ingrese su DNI");
        long dni = leer.nextLong();

        System.out.println("Ingrese su saldo actual");
        double saldo = leer.nextDouble();

        Cuenta a1 = new Cuenta();
        
        a1.setDni(dni);
        a1.setNumeroCuenta(num);
        a1.setSaldoActual(saldo);

        return a1;

    }

    public double ingresar(Cuenta a1) {

        System.out.println("Ingrese el monto a depositar");
        double deposito = leer.nextDouble();

        double saldo = a1.getSaldoActual();

        saldo = saldo + deposito;

        a1.setSaldoActual(saldo);

        return saldo;

    }

    public double retiro(Cuenta a1) {

        System.out.println("Cuanto dinero desea retirar");

        double retiro = leer.nextDouble();

        double saldo = a1.getSaldoActual();

        if (saldo > retiro) {

            saldo = saldo - retiro;
            
            a1.setSaldoActual(saldo);
        } else {
            
            a1.setSaldoActual(saldo=0);

        }

        return saldo;

    }

    public double extracciónRapida(Cuenta a1) {

        double saldo = a1.getSaldoActual();

        System.out.println("Cuanto desea retirar con el modo Extraccion Rapida");

        double extraccion = leer.nextDouble();

        if ((saldo * 0.2) > extraccion) {

            saldo = saldo - extraccion;
            
            a1.setSaldoActual(saldo);

        } else {
            System.out.println("Ingrese un monto menor");

        }

        return saldo;

    }

    public void consultarSaldo(Cuenta a1) {

        System.out.println("Su saldo es: " + a1.getSaldoActual());
        

    }

    public void consultarDatos(Cuenta a1) {

        System.out.println(a1.toString()) ;
        

    }

}
