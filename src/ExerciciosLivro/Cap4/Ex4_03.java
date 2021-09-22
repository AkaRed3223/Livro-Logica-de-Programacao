package ExerciciosLivro.Cap4;

public class Ex4_03 {

    public static void main(String[] args) {

        String cod = "001";
        String nome = "Tv Samsung 75 polegadas";
        int quant = 3;
        float valor = 6500f;
        float valorTotal = quant * valor;

        System.out.println("Você efetuou uma compra de " + quant + " " + nome + " com o código " + cod + ".");
        System.out.println("O valor de cada produto é de " + valor);
        System.out.println("Seu total é de " + valorTotal);
    }
}

