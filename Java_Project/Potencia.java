package Java_Project;

import java.util.Scanner;

public class Potencia {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        while (true) {

            System.out.println("\nCaso você queira saber uma potência, digite abaixo a base e o expoente.\n");

            System.out.println("Digite a base: ");
            int base = sc.nextInt();

            System.out.println("\nDigite o expoente: ");
            int expoente = sc.nextInt();

            double resultado = Math.pow(base, expoente);

            System.out.println("\nO resultado da " + resultado);
        }

    }

}
