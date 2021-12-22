package EJ2.Entidades;

public final class Televisor extends Electrodomesticos {

    private int resolucion;
    private boolean tdt;

    public Televisor() {
        super();   }

    public Televisor(int resolucion, boolean tdt, double precio, double peso, String color, char consumo) {
        super(precio, peso, color, consumo);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return "Televisor{"+super.toString() + "resolucion=" + resolucion + ", tdt=" + tdt + '}';
    }

    
    
    
    public void crearTelevisor() {
        super.crearElectrodomestico();

        System.out.println("Resolución");
        setResolucion(leer.nextInt());

        System.out.println("Sintonizador TDT s/n");
        String letra = leer.next();
        if (letra.equals("s")) {
            tdt = true;
        } else {
            tdt = false;
        }
        this.setTdt(tdt);
    }

    @Override
    public double precioFinal() {
       
        if (resolucion > 40) {
            precio = precio * 1.3;

        }

        if (tdt) {
            precio += 500;
        }

        return precio;
    }
}
