package poo.entidades.circunferencia;

public class Circunferencia {

    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese radio");
        this.radio = radio;
    }

    public double areaCircunferencia() {
        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public double perimetroCircunferencia() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;

    }

}
