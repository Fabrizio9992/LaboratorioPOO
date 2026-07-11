package ej_1;

public class Inventario {
	
	private Producto[]productos;
	private int Cantidad;
	
	public Inventario(int Capacidad){
		productos= new Producto[Capacidad];
		Cantidad = 0;
	}
	public void agregarProducto(Producto p) {
		productos[Cantidad] = p;
		Cantidad++;
	}
	public void listarProductos() {
		for(int i = 0; i < Cantidad; i++) {
			System.out.println(productos[i]);
		}
		System.out.println("Cantidad de Productos. " +Cantidad); 
	}
}
