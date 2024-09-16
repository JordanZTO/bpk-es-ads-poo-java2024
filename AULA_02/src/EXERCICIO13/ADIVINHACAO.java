import java.util.Scanner;
import java.util.Random;

public class ADIVINHACAO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // O computador escolhe um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroAleatorio) {
                System.out.println("O número é maior que " + tentativa + ".");
            } else if (tentativa > numeroAleatorio) {
                System.out.println("O número é menor que " + tentativa + ".");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (tentativa != numeroAleatorio);

        scanner.close();
    }
}
