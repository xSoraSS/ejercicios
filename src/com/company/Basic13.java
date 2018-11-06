package com.company;

import java.util.Scanner;

public class Basic13 {

    public static void main(String[] args) {
        //pide numero
        System.out.println("Introduce un número para ver su tabla de múltiplicar:");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        System.out.println(num);
        //mostrar tabla
        for (int i = 0;i <= 10; i++) {
            int mult = num * i;
            System.out.println(num + "*" + i + "=" + mult);
        }
    }
}
