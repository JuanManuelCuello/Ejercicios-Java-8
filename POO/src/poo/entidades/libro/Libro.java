package poo.entidades.libro;

public class Libro {

    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumeroPagina;

    public Libro(String ISBN, String Titulo, String Autor, int NumeroPagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPagina = NumeroPagina;
    }

    public Libro() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPagina() {
        return NumeroPagina;
    }

    public void setNumeroPagina(int NumeroPagina) {
        this.NumeroPagina = NumeroPagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroPagina=" + NumeroPagina + '}';
    }

}
