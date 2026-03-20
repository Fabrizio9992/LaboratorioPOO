package main;

import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[6];

        System.out.println("Ingrese tus 6 números:");

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        System.out.print("Al revés: ");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
            sc.close();
        }
    }
}