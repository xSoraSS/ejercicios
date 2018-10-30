package com.company;

import java.util.Scanner;

public class Basic1 {

    public static void main(String[] args) {
        //Pide número
        System.out.println("Año:");
        Scanner teclado = new Scanner(System.in);
        int año = teclado.nextInt();
        //Comprueba si es bisiesto.
        if(año%4 == 0 ){
            if(año%100 ==0){
               if(año%400==0){
                   System.out.println("Es bisiesto.");
               } else {
                   System.out.println("No es bisiesto.");
               }
            } else {
                System.out.println("Es bisiesto");
            }
        }else{
            System.out.println("No es bisiesto.");
        }
    }
}
