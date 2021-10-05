package ExerciciosLivro.Cap5.Ex5_02;

//O exercício está feito com as estruturas de repetição ao início e ao final (nessa ordem)

public class Ex5_02 {
    public static void main(String[] args) {

        int alturaPedro = 150; // altura em centímetros
        int alturaLucas = 110;
        int anos = 0;

        while (alturaPedro>alturaLucas){
            alturaPedro += 2;
            alturaLucas += 3;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Lucas fique mais alto que Pedro.");
    }
}

//Com implementação de verificação ao final:

/*
public class Ex5_02 {
    public static void main(String[] args) {

        int alturaPedro = 120;
        int alturaLucas = 105;
        int anos = 0;

        do {
            alturaPedro += 2;
            alturaLucas += 3;
            anos++;
        } while (alturaPedro >= alturaLucas);

        System.out.println("Serão necessários " + anos + " anos para que Lucas fique mais alto que Pedro.");
    }
}
*/
