package ej_4;

public class Seleccion {

    private Jugador[] jugadores;
    private int cantidad;

    public Seleccion(int capacidad) {
        jugadores = new Jugador[capacidad];
        cantidad = 0;
    }

    public void agregarJugador(Jugador j) {
        jugadores[cantidad] = j;
        cantidad++;
    }

    public void listarJugadores() {

        for (int i = 0; i < cantidad; i++) {
            System.out.println(jugadores[i]);
        }

        System.out.println("Cantidad de jugadores: " + cantidad);
    }
}