package ExerciciosLivro.Cap5.Ex5_03;

//O programa abaixo é uma tabuada. Simples assim.

import java.util.Scanner;

public class Ex5_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número a ser calculado");
        int num = input.nextInt();

        System.out.println("Quer a tabuada até quanto?");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int result = num * i;
            System.out.println(num + " x " + i + " = " + result);


        }
    }
}
