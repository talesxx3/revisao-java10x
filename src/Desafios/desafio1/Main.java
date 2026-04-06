package Desafios.desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int totalDeCadastro = 0;

        int numeroMax = 4;
        String[] cadastro = new String[numeroMax];

        while (opcao != 3) {
            System.out.println("\n===== Menu Cadastro =====");
            System.out.println("1. Cadastrar Pessoas");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (totalDeCadastro < numeroMax) {
                        System.out.println("Digite o nome da pessoa para cadastro:");
                        String nomeCadastro = sc.nextLine();
                        cadastro[totalDeCadastro] = nomeCadastro;
                        totalDeCadastro++;
                        System.out.println("Cadastro realizado");
                    } else {
                        System.out.println("A lista já esta cheia...");
                    }
                    break;
                case 2:
                    System.out.println("Lista de pessoas cadastradas:");
                    for (int i = 0; i < cadastro.length; i++) {
                        System.out.println(cadastro[i]);
                    }
                    break;
                case 3:
                    System.out.println("Encerrando.....");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }


        }


        sc.close();
    }
}
