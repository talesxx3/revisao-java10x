package moduloinicial.array;

public class Main {
    public static void main(String[] args) {

        String [] nome = new String[3];
        nome[0] = "naruto";
        nome[1] = "sasuke";
        nome[2] = "sakura";

        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }

        // Array de idade
        int [] idade = new int[3];
        idade[0] = 17;
        idade[1] = 17;
        idade[2] = 17;

        for (int j = 0; j < idade.length; j++) {
            System.out.println(idade[j]);
        }

    }
}
