package EJ1;

import java.util.ArrayList;
import java.util.List;

public class Herencia {

    public static void main(String[] args) {

        List<Animal> lista = new ArrayList();
        
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        lista.add(perro);
        
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        lista.add(perro1);

        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        lista.add(gato);

        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        lista.add(caballo);

        for (Animal animal: lista) {
           
            animal.Alimentarse();
            
            
//            
//            if(animal instanceof Perro) {
//                Animal p1 = (Perro) animal;
//                System.out.println("2");
//                p1.Alimentarse();
//            }
//            if (animal instanceof Gato) { 
//                Animal g = (Gato) animal; 
//                System.out.println("3");
//                g.Alimentarse(); 
//            } 
//            if(animal instanceof Caballo) {
//                Animal c = (Caballo) animal;
//                System.out.println("4");
//                c.Alimentarse();
//            }
//            
//            animal.mostrarDatos();
//            System.out.println("=============");
        }
         
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    

