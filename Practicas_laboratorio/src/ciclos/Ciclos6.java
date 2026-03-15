package ciclos;

import java.util.Scanner;

public class Ciclos6 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int numero;
			int suma = 0;
			int contador = 0;

			while (suma < 20) {

			    System.out.print("Ingrese un número: ");
			    numero = teclado.nextInt();

			    suma = suma + numero;
			    contador = contador + 1;
			}

			double promedio = (double) suma / contador;

			System.out.println("La suma es: " + suma);
			System.out.println("El promedio es: " + promedio);
		}

    }
}