
package poo.principal.EJ9;

import static java.lang.Math.max;
import poo.entidades.matematica.Matematica;
import poo.servicios.matematica.MatematicaServicio;


public class EJ9 {

   
    public static void main(String[] args) {
  
       Matematica matematica = new Matematica();  
       
       MatematicaServicio matematicaservicio = new MatematicaServicio();
       
       Matematica nume1 = new Matematica();
      
                 double mayore = max( nume1.getNum1() , nume1.getNum2()  );  

       
       nume1.setNum1(Math.random()*100);
        
       nume1.setNum2(Math.random()*100);
        System.out.println(nume1.getNum1()); 
       System.out.println(nume1.getNum2()); 
       matematicaservicio.devolverMayor(nume1);
       matematicaservicio.calcularPotencia(nume1);
       matematicaservicio.calcularRaiz(nume1);
       
       
       
    }
   

}    

  
    
    

