package Atividade4;

public class Exercicio12 {
    public static void main(String[] args) {

        boolean ePrimo = true;

        int numero = 7;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {

                ePrimo = false;

            }
        }
            if (ePrimo == true) {

                System.out.println("O número é um primo!");

        } else {

                System.out.println("O número NÃO é primo!");

        }
    }
}
