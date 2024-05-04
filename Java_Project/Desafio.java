package Java_Project;

import java.util.Random;
import java.util.Scanner;

public class Desafio {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        Random gerador = new Random();

        int numero_aleatorio = gerador.nextInt(11);

        System.out.println("Tente adivinhar o número aleatório. \n");

        while (true) {

            System.out.println("Por favor, informe um número: ");

            int palpite = sc.nextInt();

            if (numero_aleatorio == palpite) {

                System.out.println("\nVocê acertou o número aleatório.");
                break;

            } else {

                System.out.println("\nVocê errou. Tente novamente.");
                
                if (palpite > numero_aleatorio) {

                    System.out.println("Dica: O número que você tentou é maior do que o número aleatório.\n");

                } else {

                    System.out.println("Dica: O número que você tentou é menor do que o número aleatório.\n");

                }

            }

        }


    }
}
