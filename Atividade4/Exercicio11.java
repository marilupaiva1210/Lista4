package Atividade4;

public class Exercicio11 {
    public static void main(String[] args) {

        String palavra = "breno";
        String invertida = "";

        for (int i = (palavra.length() - 1); i >= 0; i--) {
            invertida = invertida + palavra.charAt(i);

            System.out.println(invertida);
        }

        if (invertida.equals(palavra)) {

            System.out.println("A palavra é um palíndromo!");

        } else {

            System.out.println("A palavra NÃO é um palíndromo!");

        }
    }
}
