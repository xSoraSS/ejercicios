package com.company;

import java.util.Scanner;

public class basic16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, h;
        //pide base y altura del triangulo
        System.out.println("Base:");
        b = teclado.nextInt();
        System.out.println("Altura:");
        h = teclado.nextInt();
        //calcula area triangulo
        a = (b*h) / 2;
        System.out.println("Area: " + a);
    }
}
