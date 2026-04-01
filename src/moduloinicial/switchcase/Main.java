package moduloinicial.switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 5");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Voce escolheu o numero 1, e nao ganhou nada");
                break;
            case 2:
                System.out.println("Voce escolheu o numero 2, e nao ganhou nada");
                break;
            case 3:
                System.out.println("Voce escolheu o numero 3, e ganhou um premio");
                break;
            case 4:
                System.out.println("Voce escolheu o numero 4, e nao ganhou nada");
                break;
            case 5:
                System.out.println("Voce escolheu o numero 1, e nao ganhou nada");
                break;
            default:
                System.out.println("Numero invalido");
        }


        sc.close();

    }
}
