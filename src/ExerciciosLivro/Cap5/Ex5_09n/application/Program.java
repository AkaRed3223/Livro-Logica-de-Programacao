package ExerciciosLivro.Cap5.Ex5_09n.application;

//TODO Falta implementar o comparador de idades

import ExerciciosLivro.Cap5.Ex5_09n.entities.Cliente;
import ExerciciosLivro.Cap5.Ex5_09n.entities.Escolaridade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Cliente> clienteList = new ArrayList<>();

        char opcao;
        do {
            System.out.print("Sexo (m/f): ");
            char clienteSexo = input.next().charAt(0);
            System.out.print("Idade: ");
            int clienteIdade = input.nextInt();
            System.out.print("Escolaridade: ");
            input.nextLine();
            String clienteEscolaridade = input.nextLine();
            clienteList.add(new Cliente(clienteSexo, clienteIdade, Escolaridade.valueOf(clienteEscolaridade)));

            System.out.print("Deseja cadastrar outro candidato (s/n)? ");
            opcao = input.next().charAt(0);
        } while (opcao == 's');

        int mCont = 0;
        int mIdade = 0;
        int meiaIdadeHomem = 0;
        int fCont = 0;
        int fIdade = 0;

        for (Cliente c : clienteList) {
            if (c.getSexo() == 'm') {
                mCont++;
                mIdade += c.getIdade();
                if (c.getIdade() >= 35 && c.getIdade() <= 45) {
                    meiaIdadeHomem++;
                }
            } else if (c.getSexo() == 'f') {
                fCont++;
                fIdade += c.getIdade();

                //TODO Implementar o comparador de idades

            } else {
                System.out.println("Erro: Terminando o programa");
            }
        }

        int fundamentalCont = 0;
        int medioCont = 0;
        int superiorCont = 0;
        int posCont = 0;
        for (Cliente c : clienteList) {
            if (c.getEscolaridade() == Escolaridade.ENSINO_FUNDAMENTAL) {
                fundamentalCont++;
            } else if (c.getEscolaridade() == Escolaridade.ENSINO_MEDIO) {
                medioCont++;
            } else if (c.getEscolaridade() == Escolaridade.ENSINO_SUPERIOR) {
                superiorCont++;
            } else if (c.getEscolaridade() == Escolaridade.POS_GRADUACAO) {
                posCont++;
            }
        }

        double mMedia = (double) mIdade / mCont;
        double fMedia = (double) fIdade / fCont;
        double mPercentagem = (double) meiaIdadeHomem / mCont * 100;

        System.out.println();
        System.out.print("Número de candidatos do sexo feminino: " + fCont + "\n");
        System.out.print("Número de candidatos do sexo masculino: " + mCont + "\n");
        System.out.printf("Idade média dos homens: %.2f%n", mMedia);
        System.out.printf("Idade média das mulheres: %.2f%n", fMedia);
        System.out.println("Percentagem dos homens entre 35 e 45 anos: " + String.format("%.2f", mPercentagem) + "%");

        System.out.println();
        System.out.println("Quantidade de pessoas com Ensino Fundamental: " + fundamentalCont);
        System.out.println("Quantidade de pessoas com Ensino Médio: " + medioCont);
        System.out.println("Quantidade de pessoas com Ensino Superior: " + superiorCont);
        System.out.println("Quantidade de pessoas com Pós-Graduação: " + posCont);

        //Falta implementar o comparador de idades

        input.close();
    }
}
