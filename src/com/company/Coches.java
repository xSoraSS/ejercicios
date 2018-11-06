package com.company;

import java.util.Scanner;

public class Coches {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos coches hay?");
        int[] gap;
        int total = 0;
        int coches = teclado.nextInt();
        gap = new int[coches];
        for (int i = 0; i < gap.length; i++) {
            System.out.println("Introduce tiempos entre los coches " + i);
            gap[i] = teclado.nextInt();
            total+=gap[i];
        }
        System.out.println("Entre el primer coche y el último hay " + total + " segundos.");
    }
}
