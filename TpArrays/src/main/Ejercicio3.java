package main;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 10, 8, 9};
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El menor es: " + menor);
    }
}