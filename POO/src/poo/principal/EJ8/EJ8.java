package poo.principal.EJ8;

import java.util.Scanner;
import poo.entidades.Cadena.Cadena;
import poo.servicios.Cadena.CadenaServicio;

public class EJ8 {

    public static void main(String[] args) {

       
        Cadena cadena = new Cadena();

        CadenaServicio cadenaservicio = new CadenaServicio();

        Cadena cadena1 = cadenaservicio.crearCadena();
        
        cadenaservicio.MostrarVocales(cadena1);
        
        cadenaservicio.invertirFrase(cadena1);
        
        cadenaservicio.vecesRepetido(cadena1);
        
        cadenaservicio.compararFrase(cadena1);
        
        cadenaservicio.unirFrase(cadena1);
        
        cadenaservicio.reemplazar(cadena1);
        
        System.out.println(cadenaservicio.contiene(cadena1));
    }
    

}
