package main;

import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] listaPalabras = {"talco", "nerdo", "gatos", "guita", "verde", "pecho", "pizza"};
        String palabra = listaPalabras[random.nextInt(listaPalabras.length)];

        char[] progreso = new char[palabra.length()];
        Arrays.fill(progreso, '_');

        int aciertos = 0;

        System.out.println("Adivina la palabra");

        while (aciertos < palabra.length()) {

            for (char c : progreso) {
                System.out.print(c + " ");
            }

            System.out.print("\nIngrese una letra: ");
            char letra = sc.next().charAt(0);

            boolean encontrada = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra && progreso[i] == '_') {
                    progreso[i] = letra;
                    aciertos++;
                    encontrada = true;
                }
            }

            if (!encontrada) {
                System.out.println("Nop es Incorrecta");
            }
        }

        System.out.println("Bien ahi, ganaste la palabra era: " + palabra);
        sc.close();
    }
}