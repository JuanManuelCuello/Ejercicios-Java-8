
package EJ2.Entidades;

/**
 *
 * @author Juan Manuel
 */
public final class Lavadora extends Electrodomesticos  {
    
    private double carga;
    
    
    
    
    public Lavadora() {
        super();
    }

    public Lavadora(double precio, double peso, String color, char consumo) {
        super(precio, peso, color, consumo);
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{"+ super.toString() + "carga=" + carga + '}';
    }

   
    
    
    
    
    public void crearLavadora(){
        super.crearElectrodomestico();
        
        System.out.println("Ingrese la carga de la lavadora");
        setCarga(leer.nextInt());
        
        
    }
    
    @Override
    public double precioFinal(){
        double precio = super.precioFinal();
//        double carga = this.getCarga();
        if (carga>30){
            precio += 500;
        }
          
    return precio;
    }
    
   
    
    
}
