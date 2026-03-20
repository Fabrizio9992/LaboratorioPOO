package main;

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lista = new int[8];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(100);
        }

        for (int num : lista) {
            System.out.print(num + " ");
        }

        int mayor = lista[0];
        int menor = lista[0];

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
            if (lista[i] < menor) {
                menor = lista[i];
            }
        }

        System.out.println();
        System.out.println("Mayor: " + mayor + " | Menor: " + menor);
    }
}