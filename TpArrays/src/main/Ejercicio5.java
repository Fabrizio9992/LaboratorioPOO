package main;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {1, 1, 1, 3, 1, 4, 2, 2, 2, 4};
        int cantidadPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cantidadPares++;
            }
        }

        System.out.println("Pares: " + cantidadPares);
    }
}