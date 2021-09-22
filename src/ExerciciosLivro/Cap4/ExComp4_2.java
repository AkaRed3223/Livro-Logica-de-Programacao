package ExerciciosLivro.Cap4;

import java.util.Scanner;

public class ExComp4_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá. Digite o seu sexo");
        System.out.println("1 - Masculino");
        System.out.println("2 - Feminino");
        int cod = input.nextInt();

        System.out.println("Agora digite a sua altura no formato X,YY");
        double altura = input.nextDouble();

        System.out.println("Agora digite o seu peso");
        double peso = input.nextDouble();

        double pIdealH = (72.7 * altura) - 58;
        double fPesoH = pIdealH - peso;
        double pIdealM = (62.1 * altura) - 44.7;
        double fPesoM = pIdealM - peso;

        if (cod == 1) {
            if (fPesoH < 0) {
                System.out.println("Você está acima do peso");
            } else {
                System.out.println("Seu peso está bom");
            }
            System.out.println("Seu peso ideal é " + pIdealH);
        } else {
            if (fPesoM < 0) {
                System.out.println("Você está acima do peso");
            } else {
                System.out.println("Seu peso está bom");
            }
            System.out.println("Seu peso ideal é " + pIdealM);
        }
    }
}
