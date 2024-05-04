package Java_Project;

import java.util.Scanner;

public class Media_Num_Par_Imp {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int armaz_pares = 0;
        int armaz_impares = 0;
        int cont_pares = 0;
        int cont_impares = 0;

        System.out.println("Digite os números, do tipo inteiro, para descobrir a média, tanto dos números pares como dos números ímpares - Digite 0 para saber o resultado.");
        int numero = sc.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0) {

                armaz_pares += numero;
                cont_pares++;

            } else {
    
                armaz_impares += numero;
                cont_impares++;

            }
            
            numero = sc.nextInt();

        }

        if (cont_pares > 0) {

            double media_pares = (double) armaz_pares / cont_pares;
            System.out.println("A média dos números pares é: " + media_pares);

        } else if (cont_pares == 0) {

            System.out.println("Não foi digitado números pares. Não é possível realizar a sua média. ");

        }
         
        if (cont_impares > 0) {

        double media_impares = (double) armaz_impares / cont_impares;
        System.out.println("A média dos números ímpares é: " + media_impares);

        } else if (cont_impares == 0) {

        System.out.println("Não foi digitado números ímpares. Não é possível realizar a sua média. ");

        }

}

}
