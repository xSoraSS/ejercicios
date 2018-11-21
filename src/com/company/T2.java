package com.company;

import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt(), n1 = num;
        while (num != 0) {
            int n2 = num;
            num = teclado.nextInt();
                if (n1 == n2 && num == 0) {
                    System.out.println("SI");
                    break;
                } else if (n1 != n2 && num == 0) {
                    System.out.println("NO");
                    break;
            }
        }
    }
}