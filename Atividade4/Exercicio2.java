package Atividade4;

import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {

        int[] v2 = new int[8];
        int[] v1 = {5 , 1 , 4 , 2 , 7 , 8 , 3 , 6};

        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[i] * 2;


        }

        System.out.println("Vetor 2: " + Arrays.toString(v1));

    }
}
