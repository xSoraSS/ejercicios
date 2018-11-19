package com.company;

import java.util.Scanner;

    public class vecesrepetido {

        public static void main(String[] args) {
            //leer grupos
            //los grupos constan de numero iguales
            //contar el numero de grupos que hay
            //contar cuantas veces se repite un numero o desde donde hasta donde se repite con array y for.
            Scanner teclado = new Scanner(System.in);
            int num = teclado.nextInt();
            int num2, num3;
            int cont = 0;
            int grup = 0;
            while(num != 0){
                num2 = num;
                num3 = num2;
                num = teclado.nextInt();
                if(num != num2 && num != 0) {
                    grup++;
                }else if(num == 0){
                    break;
                }
                if(num == num3){
                    cont++;
                    System.out.println(num3 + " se repite " + cont);
                }
            }
            System.out.println(grup + " grupos");
        }
    }
