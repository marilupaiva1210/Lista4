package Atividade4;

import java.util.Scanner;
import java.util.function.Function;

public class Exercicio9 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("digite um valor: ");
            int NU = input.nextInt();

            char resultado = verificaNumero(NU);

            System.out.println("o número digitado é " + resultado);
        }

        public static char verificaNumero(int NUM) {
            if (NUM > 0) {
                return 'P';
            } else {
                return 'N';
            }
        }
    }

