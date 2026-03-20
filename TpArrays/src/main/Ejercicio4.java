package main;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] valores = {1, 1, 1, 3, 1, 4, 2, 2, 2, 4};
        int suma = 0;

        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }

        int promedio = suma / valores.length;

        System.out.println("Promedio: " + promedio);
    }
}