package com.company;

import java.util.Scanner;

public class tipoexamen1 {

    public static void main(String[] args) {
        // Imprimir por pantalla si de un numero al siguiente aumenta o disminuye
        // ejemplo: 3 5 4 7 7 == + - + =
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        while(num != 0) {
            int num2 = num;
            num = teclado.nextInt();
            if (num2 > num && num != 0) {
                System.out.println("-");
            }else if(num2 < num && num != 0){
                System.out.println("+");
            }else if(num2 == num && num != 0){
                System.out.println("=");
            }
        }
    }
}
