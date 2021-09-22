package ExerciciosLivro.Cap4;

public class Ex4_08 {

    public static void main(String[] args) {

        int num = 24; // insira aqui número a ser verificado
        int verifMult3 = num % 3; // verifica se o número é múltiplo de 3
        int verifMult7 = num % 7; // verifica se o número é múltiplo de 7

        if (verifMult3 != 0 && verifMult7 != 0) {
            System.out.println("O número " + num + " não é múltiplo de 3 nem de 7");
        } else {
            if (verifMult3 == 0 && verifMult7 != 0) {
                System.out.println("O número " + num + " é múltiplo de 3, mas não de 7");
            } else {
                if (verifMult3 == 0 && verifMult7 == 0) {
                    System.out.println("O número " + num + " é múltiplo de 3 e de 7");
                } else {
                    if (verifMult3 != 0 && verifMult7 == 0)
                        System.out.println("O número " + num + " é múltiplo de 7, mas não de 3");
                }
            }
        }
    }
}

