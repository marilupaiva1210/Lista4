package Atividade4;

import java.util.Arrays;

public class Exercicio1 {
    public static void main(String[] args) {

        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * i * i;

        }

        System.out.println("cálculo da raiz cúbica: " + Arrays.toString(vetor));

    }


}
