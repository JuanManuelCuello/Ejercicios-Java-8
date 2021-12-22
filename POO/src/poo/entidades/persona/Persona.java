
package poo.entidades.persona;


public class Persona {
    
    private String nombre;
    private String sexo;
    private double edad;
    private double peso; 
    private double altura;
    private double imc;
    private boolean mayor;

   

    public Persona(String nombre, String sexo, double edad, double peso, double altura, double imc, boolean mayor) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.mayor = mayor;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public boolean isMayor() {
        return mayor;
    }

    public void setMayor(boolean mayor) {
        this.mayor = mayor;
    }

    public Persona() {
         
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", mayor=" + mayor + '}';
    }

    
    
    
    
    
}
