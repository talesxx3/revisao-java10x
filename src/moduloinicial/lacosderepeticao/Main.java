package moduloinicial.lacosderepeticao;

public class Main {
    public static void main(String[] args) {
        int numerosDeClones = 0;
        int numerosMaximo = 69;

        while (numerosDeClones <= numerosMaximo) {
            numerosDeClones++;
            System.out.println("O naruto fez um clone");
        }

        for (int i = 0; i < numerosMaximo; i++) {
            System.out.println("Naruto se clonou " + i + " vezes");
        }
    }
}
