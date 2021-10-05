package ExerciciosLivro.Cap5.Ex5_08;

import java.util.Scanner;

public class Ex5_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, soma = 0;
        String resposta;

        do {
            System.out.println("Digite um número para a soma");
            num = input.nextInt();

            soma = soma + num;

            System.out.println("A soma é: " + soma);
            System.out.println("Deseja continuar? ('sim ou nao')");
            resposta = input.next();
        } while (resposta.equals("sim"));
    }
}
