package tp4_ej5;

public class Cocinero {
    private String nombre;
    private Menu[] menus;
    private int contador;

    public Cocinero(String nombre) {
        this.nombre = nombre;
        this.menus = new Menu[10];
        this.contador = 0;
    }

    public void agregarMenu(Menu m) {
        menus[contador] = m;
        contador++;
    }

    public void mostrar() {
        System.out.println("Cocinero: " + nombre);
        System.out.println("Menús supervisados:");

        for (int i = 0; i < contador; i++) {
            menus[i].mostrar();
            System.out.println();
        }
    }
}