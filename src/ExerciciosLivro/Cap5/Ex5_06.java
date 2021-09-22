package ExerciciosLivro.Cap5;

//Se você não sabe do quê se trata o problema abaixo, eu explico:
//Este problema é considerado o maior problema matemático da história, o famoso "3x+1".
//A idéia é que se você pegar qualquer número, qualquer mesmo, e aplicar essa pequena fórmula condicional,
//SEMPRE SERÁ POSSÍVEL REDUZIR ESSE NÚMERO A ZERO.

import java.util.Scanner;

public class Ex5_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        do {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n  = n * 3 + 1;
            }
        } while(n != 1);

        System.out.println(n);
    }
}
