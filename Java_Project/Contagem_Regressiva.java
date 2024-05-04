package Java_Project;

import java.util.Scanner;

public class Contagem_Regressiva {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        while(true) {

            System.out.println("\nPor favor, informe um número para iniciar a contagem regressiva. ");
            int numero = sc.nextInt();

            System.out.println("\nContagem regressiva: ");

            do {

                System.out.println(numero--);

            } while (numero >= 0);

        }

    }

}
