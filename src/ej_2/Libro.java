package ej_2;

public class Libro {

    private String titulo;
    private String isbn;
    private int cantidadPaginas;

    public Libro(String titulo, String isbn, int cantidadPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo +
                " | ISBN: " + isbn +
                " | Páginas: " + cantidadPaginas;
    }
}