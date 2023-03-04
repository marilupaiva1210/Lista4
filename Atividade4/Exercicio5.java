package Atividade4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] Q = new int[10];
        int maior = 0;
        int aceitacao;


        for (int i = 0; i < 10;) {
            System.out.print("informe o valor: ");
            aceitacao = input.nextInt();

            if ((aceitacao % 2) == 0){
                Q[i] = aceitacao;
                System.out.println("valor válido");
                i++;

            }
            else {

                System.out.println("valor inválido");

            }

                if (aceitacao > maior) {
                    maior = aceitacao;
                    System.out.println("maior valor: " + maior);

            }
        }

        input.close();

    }
}


