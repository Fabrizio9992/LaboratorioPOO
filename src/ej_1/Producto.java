package ej_1;

public class Producto {
	private String nombre;
	private int codigo;
	private double precio;
	private String datos;
	public Producto(String nombre,int codigo, String datos, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.datos = datos;
		this.precio = precio;	
	}
	public String getnombre() {
		return nombre;
	}
	public int getcodigo() {
		return codigo;
	}
	public double getprecio() {
		return precio;
	}
	public String getdatos() {
		return datos;
	} 
	@Override
    public String toString() {
        return "Nombre: " + nombre +
                "| Código: " + codigo +
                "| Precio: $" + precio;
	}
}