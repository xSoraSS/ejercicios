package com.company;

import java.util.Scanner;

public class basic4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2;
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();

        if(n1%n2 == 0){
            System.out.println("Son multiplos.");
        }else{
            System.out.println("No son multiplos.");
        }
    }
}
