package Introducao.Condicoes;

public class ifEelse {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        int idade = 18;
        boolean hokage = true;
        int numeroDeMissoes = 2;

        // se (condicao) {faca isso}
        if (hokage == true && idade >= 18) {
            System.out.println("Hokage");
        } else if (idade == 17) {
            System.out.println("Quase lá");
        } else {
            System.out.println("Muito cedo");
        }
    }
}
