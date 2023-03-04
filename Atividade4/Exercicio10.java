package Atividade4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = input.nextInt();

        int resultado = Digitos(numero);

        System.out.println("A quantia de dígitos do número é: " + resultado);

    }
    public static int Digitos(int NUM) {

        int contador = 1;

        while (NUM >= 10) {
            NUM /= 10;
            contador++;

        }

        return contador;

    }
}










