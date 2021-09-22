package ExerciciosLivro.Cap4;

public class Ex4_06 {

    public static void main(String[] args) {

        int num = 15; // insira aqui o número a ser verificado
        int verificadorPar = num % 2; // Resto da divisão por 2

        if (verificadorPar == 0) {
            System.out.println("Número escolhido: " + num);
            System.out.println(num + " é par");
        } else {
            System.out.println("Número escolhido: " + num);
            System.out.println(num + " é ímpar");
        }
    }
}

