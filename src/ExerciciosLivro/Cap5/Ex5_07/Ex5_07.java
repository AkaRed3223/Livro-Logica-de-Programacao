package ExerciciosLivro.Cap5.Ex5_07;

//Neste exercício devemos criar um algoritmo que calcula a mediana de uma sequência de números.
//Essa sequência é definida a partir de um número inicial e um número final,
//e a determinação da mediana tem um cenário quando a quantidade de elementos é par e outro quando é ímpar

import java.util.Scanner;

public class Ex5_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numInicial, numFinal, validador, mediana; //double pois mediana pode ser número inteiro ou real
        int contador = 0; //o contador determinará a quantidade de itens dentro da sequência

        System.out.println("Insira o número inicial");
        numInicial = input.nextInt();
        System.out.println("Insira o número final");
        numFinal = input.nextInt();

        validador = numInicial;
        //o validador começa igual ao número inicial pois ele deve ser incrementado
        //até tornar-se maior que o número final (logo abaixo)
        while (validador <= numFinal) {
            contador++;
            validador++;
        }
        //laço finalizado, agora o contador representa a quantidade de números na sequência
        //e o validador não terá mais utilidade.
        if (contador % 2 != 0) { //se a quantidade de elementos na sequência for ímpar
            do {
                //agora teremos incrementos e decrementos mútuos até que ambos os números se igualem.
                //uma vez igualados, está encontrada a mediana.
                numInicial++;
                numFinal--;
            } while (numInicial != numFinal);
            mediana = numInicial;
            System.out.println("Sua mediana é: " + mediana);
        } else { //se a quantidade de elementos na sequência for par
            do {
                numInicial++;
                numFinal--;
            } while (numInicial != numFinal - 1);
            mediana = (numInicial + numFinal) / 2;
            //devido ao fato de a quantidade de elementos ser par,
            //a mediana é a média dos dois elementos centrais
            System.out.println("Sua mediana é: " + mediana);
        }
    }
}
