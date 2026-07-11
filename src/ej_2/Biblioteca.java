package ej_2;

public class Biblioteca {

    private Libro[] libros;
    private int cantidad;

    public Biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        cantidad = 0;
    }

    public void agregarLibro(Libro libro) {
        libros[cantidad] = libro;
        cantidad++;
    }

    public void listarLibros() {

        for (int i = 0; i < cantidad; i++) {
            System.out.println(libros[i]);
        }

        System.out.println("Cantidad de libros: " + cantidad);
    }
}