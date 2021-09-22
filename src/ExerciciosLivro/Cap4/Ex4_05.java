package ExerciciosLivro.Cap4;

public class Ex4_05 {

    public static void main(String[] args) {

        double valorProduto = 5000;
        double valorDesconto = 0.9; //10% de desconto
        double valorReajustado = valorProduto * valorDesconto;

        System.out.println("Valor atual: " + valorProduto);
        System.out.println("Valor final: " + valorReajustado);
    }
}

