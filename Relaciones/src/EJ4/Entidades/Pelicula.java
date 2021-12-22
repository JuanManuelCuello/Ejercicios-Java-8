
package EJ4.Entidades;


public class Pelicula {
    
    private String titulo, director, duracion;
    private Integer edadMin;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, String duracion, Integer edadMin) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMin = edadMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edadMin=" + edadMin + '}';
    }
    
    
    
    
}
