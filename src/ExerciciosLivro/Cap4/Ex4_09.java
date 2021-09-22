package ExerciciosLivro.Cap4;

public class Ex4_09 {

    public static void main(String[] args) {

        double prova1, prova2, prova3, media, exame, var_final;

        prova1 = 5; // insira a nota da prova 1
        prova2 = 4; // insira a nota da prova 2
        prova3 = 3; // insira a nota da prova 3

        media = (prova1 + prova2 + prova3) / 3;

        if (media >= 7) {
            System.out.println("Você foi aprovado sem passar pelo exame!");
        } else {

            exame = 6; //insira aqui a nota do exame
            var_final = (media + exame) / 2;

            if (var_final >= 5) {
                System.out.println("Sua média após o exame foi de " + var_final + ". Você foi aprovado!");
            } else {
                System.out.println("Você foi reprovado!");
            }
        }
    }
}

