package ExerciciosLivro.Cap5.Ex5_01;

import java.util.Scanner;

//O código abaixo é o código do Exemplo 5.1.
//O Exercício 1 pede para que o código abaixo seja reimplementado com a estrutura de verificação ao final

//EXEMPLO 5.1
/*public class Ex5_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num, soma, media;
        int cont;

        cont = 0;
        soma = 0;

        while (cont < 10) {
            System.out.println("Informe o número:");
            num = input.nextDouble();
            soma = soma + num;
            cont++;
        }
        media = soma / cont;
        System.out.println("Média = " + media);
    }
}*/

//ABAIXO VEJA O CÓDIGO REIMPLEMENTADO

public class Ex5_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num, soma, media;
        int cont;
        cont = 0;
        soma = 0;

        do {
            System.out.println("Informe o número:");
            num = input.nextDouble();
            soma = soma + num;
            cont++;
        } while (cont < 10);

        media = soma / cont;
        System.out.println("Média = " + media);
    }
}