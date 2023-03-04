package Atividade4;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] temperaturas = {22, -1, -1, 38, 33, 28, 30};
        double ST = 0;
        int dias = 0;

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double media;

        for (double temperatura : temperaturas) {
            if (temperatura < menor) {
                menor = temperatura;

        }

            if (temperatura > maior) {
                maior = temperatura;

            }

            ST = ST + temperatura;

            }

        for (double temperatura: temperaturas) {
            if (temperatura == menor) {
                dias++;

            }
        }

        media = ST / temperaturas.length;

        System.out.println("menor: " + menor);
        System.out.println("maior: " + maior);
        System.out.println("dias em que a menor temperatura aparece: " + dias);
        System.out.println("média: " + media);

            }

        }


    

