
package EXTRA1;

import Entidades.BarcoMotor;

import Entidades.Veleros;
import Entidades.yatelujo;
import java.util.Scanner;


public class Extra1 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        String op = "";
        
        do {
            System.out.println("Ingrese un tipo de barco");
            System.out.println("a - barco motor");
            System.out.println("b - velero");
            System.out.println("c - yate de lujo");
            System.out.println("d - salir");
            op = leer.next();
            
            if (op.equals("a")) {
                BarcoMotor bm = new BarcoMotor();
                bm.crearBarcoMotor();
                System.out.println("$"+bm.calcularAlquiler());
                System.out.println(bm.toString());
                System.out.println("");
            }
            if (op.equals("b")) {
                Veleros vl = new Veleros();
                vl.crearBarcoVelero();
                System.out.println("$"+vl.calcularAlquiler());
                System.out.println(vl.toString());
                System.out.println("");
            }
            if (op.equals("c")) {
                yatelujo yl = new yatelujo();
                yl.crearBarcoYate();
                System.out.println("$"+yl.calcularAlquiler());
                System.out.println(yl.toString());
                System.out.println("");
            }
            
            
        } while (!"d".equals(op));
        
        
        
        
        
        
        
    }
    
}
