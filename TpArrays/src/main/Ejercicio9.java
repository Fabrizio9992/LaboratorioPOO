package main;

import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numerosGenerados = new int[6];
        int[] numerosUsuario = new int[6];
        int aciertos = 0;

        
        for (int i = 0; i < numerosGenerados.length; i++) {
            numerosGenerados[i] = random.nextInt(10);
        }
        for (int num : numerosGenerados) {
            System.out.print(num + " ");
        }
        Thread.sleep(5000);     
        
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        
        System.out.println("Ingresá los números:");
        for (int i = 0; i < numerosUsuario.length; i++) {
            numerosUsuario[i] = sc.nextInt();
        }
        
        for (int i = 0; i < numerosGenerados.length; i++) {
            if (numerosGenerados[i] == numerosUsuario[i]) {
                aciertos++;
            }
        }

        if (aciertos == numerosGenerados.length) {
            System.out.println("Excelente ganaste");
        } else {
            System.out.println("Casii adivinaste: " + aciertos);
            sc.close();
        }
    }
}