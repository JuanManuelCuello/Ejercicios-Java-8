
package EJ4;


public class ej4 {

   
    public static void main(String[] args) {
  
        Circulo circ = new Circulo(10, 5);
        Rectangulo rec = new Rectangulo(10,5);
        
        
        
        System.out.println("--- CIRCULO ---");
        
        System.out.println("Area circulo: "+circ.calcularArea()); 
        System.out.println("Perimetro circulo: "+circ.calcularPerimetro());
        System.out.println("");
       
        System.out.println("--- RECTANGULO ---");
        System.out.println("Area rectangulo: "+rec.calcularArea()); 
        System.out.println("Perimetro rectangulo: "+rec.calcularPerimetro());
        
    }
    
}
