
package poo.servicios.NIF;

import java.util.Scanner;
import poo.entidades.NIF.NIF;



public class NIFServicio {


    private Scanner leer = new Scanner(System.in);
    
    
    public NIF crearNif(){
        NIF nif = new NIF();
        
        System.out.println("Ingrese su DNI");
        nif.setDni(leer.nextLong());
        
        int resto = (int) (nif.getDni()%23);
        
          
        
        String [] vector = {"T", "R", "W", "A","G", "M", "Y", "F","P", "D", "X", "B","N", "J", "Z", "S","Q", "V", "H", "L","C", "K", "E"};
        
        nif.setLetra(vector[resto]);
        
       
        
    return nif;    
    }

    public void mostrar(NIF nif){
        
        System.out.println("NIF= "+nif.getDni()+"-"+nif.getLetra()); 
        
        
        
    }





    
}
