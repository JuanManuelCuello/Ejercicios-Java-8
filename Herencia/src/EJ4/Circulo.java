
package EJ4;

import static java.lang.Math.PI;


public class Circulo implements CalcularFormas {
    
    private double diametro,radio;

   

    public Circulo(double diametro, double radio) {
       
        this.diametro = diametro;
        this.radio = radio;
    }

    

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    

    @Override
    public double calcularPerimetro() {
        return PI * diametro;         
    }

    @Override
    public double calcularArea() {
       return PI * ( radio * radio );              
    }

   

    
}
