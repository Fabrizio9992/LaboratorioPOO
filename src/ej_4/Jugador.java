package ej_4;

public class Jugador {

    private String nombreCompleto;
    private String posicion;
    private int edad;
    private String club;
    private boolean convocado;

    public Jugador(String nombreCompleto, String posicion, int edad, String club, boolean convocado) {
        this.nombreCompleto = nombreCompleto;
        this.posicion = posicion;
        this.edad = edad;
        this.club = club;
        this.convocado = convocado;
    }

    @Override
    public String toString() {

        return nombreCompleto +
                " | " + posicion +
                " | " + edad +
                " años | " + club +
                " | Convocado: " + convocado;
    }
}