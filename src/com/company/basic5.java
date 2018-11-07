package com.company;

import java.util.Scanner;

public class basic5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota = 0;

        while (nota != -1 && nota > -1) {
            nota = teclado.nextFloat();
            if (nota < 5) {
                System.out.println("insuficiente.");
            } else if (nota >= 5 && nota < 6) {
                System.out.println("Suficiente.");
            } else if (nota >= 6 && nota < 7) {
                System.out.println("Bien.");
            } else if (nota >= 7 && nota < 8.5) {
                System.out.println("Notable.");
            } else if (nota >= 8 && nota < 10) {
                System.out.println("Excelente");
            } else if (nota == 10) {
                System.out.println("Matricula de honor.");
            }
        }
    }
}