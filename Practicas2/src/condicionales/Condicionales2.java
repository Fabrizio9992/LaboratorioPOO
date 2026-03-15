package condicionales;

import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int claveCorrecta = 1234;
			int clave;
			int intentos = 0;

			while (intentos < 3) {

			    System.out.print("Ingrese la clave: ");
			    clave = sc.nextInt();

			    if (clave == claveCorrecta) {
			        System.out.println("Bienvenido al Sistema");
			        return;
			    } else {
			        System.out.println("Acceso Denegado");
			        intentos++;
			    }
			}
		}

        System.out.println("Sistema Bloqueado");
    }
}