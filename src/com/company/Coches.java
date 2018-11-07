package com.company;

import java.util.Scanner;

public class Coches {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //pregunta el numero de coches
        System.out.println("Cuantos coches hay?");
        int[] gap;
        int total = 0;
        int coches = teclado.nextInt();
        //crea el array con el numero de coches
        gap = new int[coches];
        //entra en for hasta que i sea menor a la longitud del array y pide los tiempos entre los coches
        //suma todos los valores del array
        for (int i = 0; i < gap.length; i++) {
            System.out.println("Introduce los tiempos entre los coches " + i);
            gap[i] = teclado.nextInt();
            total+=gap[i];
        }
        //lo saca por pantalla
        System.out.println("Entre el primer y último coche hay " + total + " segundos.");
    }
}
