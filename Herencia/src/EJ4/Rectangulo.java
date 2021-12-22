
package EJ4;


public class Rectangulo implements CalcularFormas {
    
    private double base,altura;

  

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   

    public Rectangulo(double base, double altura) {
      
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    @Override
    public double calcularArea() {
        return base * altura;
       
    }

    @Override
    public double calcularPerimetro() {
        return (base * altura)*2;
    }
    
    
    
    
}
