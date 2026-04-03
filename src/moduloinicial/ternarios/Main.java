package moduloinicial.ternarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Maneiras de reduzir o codigo
        // variavel = (condicao) / valorSeVerdadeiro : valorSeFalso;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        String resultado = (idade > 17) ? "Maior de idade" : "Menor de idade";

        System.out.println("Resultado: " + resultado);

        sc.close();


    }
}
