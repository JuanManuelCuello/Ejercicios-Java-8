package poo.servicios.matematica;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import poo.entidades.matematica.Matematica;

public class MatematicaServicio {

    Matematica matematica = new Matematica();

    public double devolverMayor(Matematica nume1) {

        double mayore = max(nume1.getNum1(),nume1.getNum2() );
        System.out.println("el numero mayor es "+mayore);
        return mayore;
    }

    public double calcularPotencia(Matematica nume1) {
        double num1 = round(nume1.getNum1());
        double num2 = round(nume1.getNum2());

        double mayor = max(num1, num2);
        double menor = min(num1, num2);
        
        double potencia = pow(mayor, menor);
        System.out.println("la potencia es "+potencia);
        return potencia;
    }

    public double calcularRaiz(Matematica nume1){
        double num1 = nume1.getNum1();
        double num2 = nume1.getNum2();
        
        double menor = min(num1, num2);
        
        double absoluto = abs(menor);
        
        double raiz = sqrt(absoluto);
        System.out.println("la raiz es "+raiz);
     return raiz;   
    }

    
    
    
}
