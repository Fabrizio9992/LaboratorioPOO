package ej_3;

public class Hospital {

    private Paciente[] pacientes;
    private int cantidad;

    public Hospital(int capacidad) {
        pacientes = new Paciente[capacidad];
        cantidad = 0;
    }

    public void agregarPaciente(Paciente p) {
        pacientes[cantidad] = p;
        cantidad++;
    }

    public void listarPacientes() {

        for (int i = 0; i < cantidad; i++) {
            System.out.println(pacientes[i]);
        }

        System.out.println("Cantidad de pacientes: " + cantidad);
    }
}