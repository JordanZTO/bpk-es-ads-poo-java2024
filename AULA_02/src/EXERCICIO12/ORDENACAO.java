import java.util.Scanner;
import java.util.Arrays;

public class ORDENACAO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Leitura dos números
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenação do array
        Arrays.sort(numeros);

        // Impressão dos números em ordem crescente
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
