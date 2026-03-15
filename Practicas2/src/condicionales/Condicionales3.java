package condicionales;

import java.util.Scanner;

public class Condicionales3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("¿Cuántos alumnos desea calificar?: ");
			int alumnos = sc.nextInt();

			int nota;
			int suma = 0;

			for (int i = 1; i <= alumnos; i++) {

			    System.out.print("Ingrese la nota del alumno " + i + ": ");
			    nota = sc.nextInt();

			    if (nota >= 1 && nota <= 3) {
			        System.out.println("Insuficiente");
			    } else if (nota <= 5) {
			        System.out.println("Regular");
			    } else if (nota <= 7) {
			        System.out.println("Bueno");
			    } else if (nota <= 9) {
			        System.out.println("Muy Bueno");
			    } else if (nota == 10) {
			        System.out.println("Excelente");
			    }

			    suma += nota;
			}

			double promedio = (double) suma / alumnos;

			System.out.println("Promedio general del curso: " + promedio);
		}
    }
}