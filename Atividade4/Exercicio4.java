package Atividade4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[5];
        String vetor;

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("digite o nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();

        }

        System.out.println(Arrays.toString(nomes));

        System.out.print("Pesquise um nome: ");
        vetor = input.nextLine();

        boolean achei = false;
        for (String nome:nomes) {
            if (vetor.equals(nome)){
                achei = true;

            }

        }

            if (achei == true) {
        System.out.println("Achei!");

        } else {

                System.out.println("Não achei!");

            }

        input.close();

    }

}

