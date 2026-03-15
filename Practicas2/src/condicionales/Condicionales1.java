package condicionales;

import java.util.Scanner;

public class Condicionales1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int numero;
			int totalPositivos = 0;
			int cantidadNegativos = 0;

			System.out.println("Ingrese números enteros (0 para terminar):");

			do {
			    numero = sc.nextInt();

			    if (numero > 0) {
			        totalPositivos += numero;
			    } else if (numero < 0) {
			        cantidadNegativos++;
			    }

			} while (numero != 0);

			System.out.println("Suma de positivos: " + totalPositivos);
			System.out.println("Cantidad de negativos: " + cantidadNegativos);
		}

    }
}
