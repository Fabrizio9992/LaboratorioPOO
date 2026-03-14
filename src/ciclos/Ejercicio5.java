package ciclos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int numero;
			int suma = 0;
			int contador = 0;

			System.out.print("Ingrese un número (0 para terminar): ");
			numero = teclado.nextInt();

			while (numero != 0) {
			    suma = suma + numero;
			    contador = contador + 1;

			    System.out.print("Ingrese un número (0 para terminar): ");
			    numero = teclado.nextInt();
			}

			double promedio = (double) suma / contador;
			System.out.println("El promedio es: " + promedio);
		}

    }
}
