package tp4_ej1;

public class Socio {
    private int nroSocio;
    private String nombre;
    private Reserva[] reservas;
    private int contador;

    public Socio(int nroSocio, String nombre) {
        this.setNroSocio(nroSocio);
        this.setNombre(nombre);
        this.reservas = new Reserva[10];
        this.contador = 0;
    }

    public void agregarReserva(Reserva reserva) {
        reservas[contador] = reserva;
        reserva.setSocio(this);
        contador++;
    }

    public void mostrarReservas() {
        for (int i = 0; i < contador; i++) {
            reservas[i].mostrar(); 
        }
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroSocio() {
		return nroSocio;
	}

	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}
}