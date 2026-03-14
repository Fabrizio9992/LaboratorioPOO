package ciclos;

import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while (suma < 10) {
            System.out.print("Ingrese un nuevo número: ");
            int nuevo = scanner.nextInt();

            suma += nuevo;
        }

        System.out.println("La suma es: " + suma);

        scanner.close();
    }
}