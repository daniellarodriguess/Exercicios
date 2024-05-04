package Java_Project;

import java.util.Scanner;

public class Sequencia_Par {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        while (true) {
            
            System.out.println("Vamos imprimir uma sequência, de números pares, para você, a partir de um número inicial e final que você nos fornecer. ");

            System.out.println("Forneça o número inicial. ");
            int numero_i = sc.nextInt();

            System.out.println("Forneça o número final. ");
            int numero_f = sc.nextInt();

            if (numero_i % 2 == 0 && numero_f % 2 == 0) {

                System.out.println("A sequência fornecida: ");
                System.out.println(numero_i);

                while (numero_i > numero_f) {
                
                    System.out.println(numero_i-=2);
                    
                    if (numero_i == numero_f) {
    
                        System.out.println("Fim da sequência.");
                    }
    
                }
    
                while (numero_i < numero_f) {
    
                    System.out.println(numero_i+=2);
                    
                    if (numero_i == numero_f) {
    
                        System.out.println("Fim da sequência.");
                    }
                }

            } else {

                System.out.println("Um (ou os dois) dos números digitados foi ímpar. Digite novamente. ");

            }

        }

    }

}
