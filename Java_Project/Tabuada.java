package Java_Project;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            
            System.out.println("Digite um número inteiro para saber sua tabuada.");
            int numero = sc.nextInt();

            System.out.println("A multiplicação por 1 é: " + numero*1);
            System.out.println("A multiplicação por 2 é: " + numero*2);
            System.out.println("A multiplicação por 3 é: " + numero*3);
            System.out.println("A multiplicação por 4 é: " + numero*4);
            System.out.println("A multiplicação por 5 é: " + numero*5);
            System.out.println("A multiplicação por 6 é: " + numero*6);
            System.out.println("A multiplicação por 7 é: " + numero*7);
            System.out.println("A multiplicação por 8 é: " + numero*8);
            System.out.println("A multiplicação por 9 é: " + numero*9);
            System.out.println("A multiplicação por 10 é: " + numero*10);
        }

    }



}