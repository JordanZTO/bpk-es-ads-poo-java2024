import java.util.Scanner;

public class PALINDRONO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = scanner.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean ehPalindromo(String palavra) {
        String palavraSemEspacos = palavra.replaceAll("\\s+", "").toLowerCase();
        int comprimento = palavraSemEspacos.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavraSemEspacos.charAt(i) != palavraSemEspacos.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
