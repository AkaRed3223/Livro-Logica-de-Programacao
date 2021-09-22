package ExerciciosLivro.Cap4;

import java.util.Scanner;

public class Ex4_10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorCompra, valorParcela, valorFinal;
        int opcao;

        System.out.println("Digite o valor da compra");
        valorCompra = entrada.nextDouble();

        System.out.println("Escolha uma das seguintes opções:");
        System.out.println("1 - Pagamento à vista: 5% de desconto");
        System.out.println("2 - Pagamento em 3x");
        System.out.println("3 - Pagamento em 5x: acréscimo de 2%");
        System.out.println("4 - Pagamento em 10x: acréscimo de 8%");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                valorFinal = valorCompra * 0.95;
                System.out.println("Seu pagamento será: à vista com desconto");
                System.out.printf("Seu total será de: " + "%.2f%n",valorFinal);
                break;
            case 2:
                valorFinal = valorCompra;
                valorParcela = valorFinal / 3;
                System.out.println("Seu pagamento será: 3x sem juros");
                System.out.printf("Cada parcela sairá por: " + "%.2f%n",valorParcela);
                System.out.printf("Seu total será de: " + "%.2f%n",valorFinal);
                break;
            case 3:
                valorFinal = valorCompra * 1.02;
                valorParcela = valorFinal / 5;
                System.out.println("Seu pagamento será: 5x com juros de 2%");
                System.out.printf("Cada parcela sairá por: " + "%.2f%n",valorParcela);
                System.out.printf("Seu total será de: " + "%.2f%n",valorFinal);
                break;
            case 4:
                valorFinal = valorCompra * 1.08;
                valorParcela = valorFinal / 10;
                System.out.println("Seu pagamento será: 10x com juros de 8%");
                System.out.printf("Cada parcela sairá por: " + "%.2f%n",valorParcela);
                System.out.printf("Seu total será de: " + "%.2f%n",valorFinal);
                break;
        }
    }
}

