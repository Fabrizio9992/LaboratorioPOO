package tp4_ej5;

public class MenuVegano extends Menu {
    private double proteinaVegetal;

    public MenuVegano(String diaSemana, double caloriasTotales, double proteinaVegetal) {
        super(diaSemana, caloriasTotales);
        this.proteinaVegetal = proteinaVegetal;
    }

    public void mostrar() {
        System.out.println("Menú Vegano:");
        super.mostrar();
        System.out.println("Proteína vegetal: " + proteinaVegetal);
    }
}