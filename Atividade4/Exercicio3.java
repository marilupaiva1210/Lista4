package Atividade4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vA = new int[10];
        int[] vM = new int[10];
        int X;


        for (int i = 0; i < vA.length; i++) {
            System.out.print("informe valor A: ");
            vA[i] = input.nextInt();
                
            }

            System.out.print("informe valor X: ");
            X = input.nextInt();

        for (int i = 0; i < vM.length; i++) {
            vM[i] = vA[i] * X;

        }

        System.out.println("Valor de M: " + Arrays.toString(vM));

        input.close();

    }


}



