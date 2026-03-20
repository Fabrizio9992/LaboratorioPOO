package main;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        do {
            System.out.print("Ingrese un número: ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("Es menor.");
            } else {
                System.out.println("GANASTEEEE");
            }

        } while (intento != numeroSecreto);
        sc.close();
    }
}

