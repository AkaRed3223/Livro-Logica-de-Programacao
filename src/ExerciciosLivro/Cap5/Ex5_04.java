package ExerciciosLivro.Cap5;

//O exercício está resolvido,
//mas aqui não consegui entender o que o exercício pede por "a respectiva média para cada um dos itens"

import java.util.Scanner;

public class Ex5_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Forneça o número inicial");
        int numInicial = input.nextInt();
        System.out.println("Forneça o número final");
        int numFinal = input.nextInt();
        int par = 0;
        int impar = 0;
        int i;
        int mult37 = 0;

        for (i = numInicial; i <= numFinal; i++) {
            if (i % 2 == 0) {
                par++;
            } else {
                if (i % 3 == 0 && i % 7 == 0) {
                    mult37++;
                }
                impar++;
            }
        }
        System.out.println("A quantidade de números inteiros é: " + (par + impar));
        System.out.println("A quantidade de números pares é: " + par);
        System.out.println("A quantidade de números ímpares é: " + impar);
        System.out.println("A quantidade de números ímpares e divisíveis por 3 e 7 é: " + mult37);
    }
}
