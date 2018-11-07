package com.company;

import java.util.Scanner;

public class Coches {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int total = 0;
        int gap = 100000;

        while(gap != 0) {
            gap = teclado.nextInt();
            total += gap;
        }

        System.out.println(total);
    }
}
