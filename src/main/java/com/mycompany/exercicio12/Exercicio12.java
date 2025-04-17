package com.mycompany.exercicio12;

import java.util.*;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Scanner n1 = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        String num1 = n1.nextLine();
        
        Scanner n2 = new Scanner(System.in);
        System.out.print("Segundo número: ");
        String num2 = n2.nextLine();
        
        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);
        
        if(x > y){
            System.out.println(x + " é maior que " + y);
        } else if(x < y) {
            System.out.println(y + " é maior que " + x);
        } else {
            System.out.println("Os dois números são iguais");
        }
            
        }       
    }
