package ExerciciosLivro.Cap5.Ex5_05;

//SEQUÊNCIA DE FIBONACCI

import java.util.Scanner;

public class Ex5_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Até quanto deve ir a sequência de Fibonacci?");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int c;

        for (int i = 0; i < num; i = i + 1) {
            System.out.print(a + " | ");
            c = a + b;
            a = b;
            b = c;

        }
    }
}
