package com.company;

import java.util.Scanner;

public class Basic2 {

    public static void main(String[] args) {
        // pide primer numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer num:");
        int n1 = sc.nextInt();
        //pide segundo numero
        System.out.println("Segundo num:");
        int n2 = sc.nextInt();
        //pide operación (+/*)
        System.out.println("Tipo de operación:");
        sc.nextLine();
        String op = sc.nextLine();
        //operación
        if(op.equals("*")){
            int rm = n1 * n2;
            System.out.println("Resultado = " + rm);
        }else if(op.equals("+")){
            int rs = n1 + n2;
            System.out.println("Resultado = " + rs);
        }else{
            System.out.println("Incorrecto.");
        }
    }
}
