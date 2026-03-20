package main;

import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        Random random = new Random();

        String[] alumnos = {"Peñaranda", "Veliz", "Fabri", "Rodri", "Santiago"};
        int[] calificaciones = new int[alumnos.length];

        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < alumnos.length; i++) {
            if (calificaciones[i] >= 6) {
                System.out.println(alumnos[i] + " aprobó la materia con " + calificaciones[i]);
            } else {
                System.out.println(alumnos[i] + " reprobó la materia con " + calificaciones[i]);
            }
        }
    }
}