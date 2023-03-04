package Atividade4;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        for (int i = 0; i <vetor.length; i++) {
            System.out.print("digite o valor do número " + (i + 1) + ": ");
            vetor[i] = input.nextInt();

        }

        int troca;
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    troca = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = troca;

                }

            }

        }

        System.out.println("os valores informados são: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);

        }
        input.close();

    }

}



