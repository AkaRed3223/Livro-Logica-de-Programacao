package ExerciciosLivro.Cap4;

import java.util.Scanner;

public class ExComp4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a hora do Início");
        int hInicio = input.nextInt();
        System.out.println("Digite os minutos do Início");
        int minInicio = input.nextInt();
        System.out.println("Digite os segundos do Início");
        int segInicio = input.nextInt();
        System.out.println("Digite a hora do Final");
        int hFinal = input.nextInt();
        System.out.println("Digite os minutos do Final");
        int minFinal = input.nextInt();
        System.out.println("Digite os segundos do Final");
        int segFinal = input.nextInt();

        int durInicio = (hInicio*3600)+(minInicio*60)+segInicio;
        int durFinal = (hFinal*3600)+(minFinal*60)+segFinal;
        int duracao = durFinal - durInicio;

        System.out.println("Você quer saber a duração da operação em horas, minutos ou segundos?");
        System.out.println("1 - Horas");
        System.out.println("2 - Minutos");
        System.out.println("3 - Segundos");

        int cod = input.nextInt();
        switch (cod){
            case 1:
                System.out.println("A operação durou " + duracao / 3600 + " horas");
                break;
            case 2:
                System.out.println("A operação durou " + duracao / 60 + " minutos");
                break;
            case 3:
                System.out.println("A operação durou " + duracao + " segundos");
                break;
        }
        System.out.println("Obrigado por utilizar nossos serviços");
    }
}
