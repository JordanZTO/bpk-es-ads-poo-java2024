import java.util.Scanner;

public class FATORIAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        // Cálculo do fatorial usando versão iterativa
        long fatorialIterativo = calcularFatorialIterativo(numero);
        System.out.println("Fatorial (versão iterativa) de " + numero + " é: " + fatorialIterativo);

        // Cálculo do fatorial usando versão recursiva
        long fatorialRecursivo = calcularFatorialRecursivo(numero);
        System.out.println("Fatorial (versão recursiva) de " + numero + " é: " + fatorialRecursivo);

        scanner.close();
    }

    public static long calcularFatorialIterativo(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static long calcularFatorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calcularFatorialRecursivo(n - 1);
    }
}
