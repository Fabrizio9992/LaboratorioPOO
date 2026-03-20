package main;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 10, 8, 9};
        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El mayor es: " + mayor);
    }
}