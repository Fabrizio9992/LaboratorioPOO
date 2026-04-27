package tp4_ej1;

public class Reserva {
    private String fecha;
    private String tipoDeporte;
    public Reserva(String fecha, String tipoDeporte) {
        this.fecha = fecha;
        this.tipoDeporte = tipoDeporte;
    }

    public void setSocio(Socio socio) {
    }

    public void mostrar() {
        System.out.println("Fecha: " + fecha + " | Deporte: " + tipoDeporte);
    }
}