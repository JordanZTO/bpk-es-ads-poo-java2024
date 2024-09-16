import java.util.Scanner;

public class VOGAIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string:");
        String texto = scanner.nextLine();

        int contagemVogais = contarVogais(texto);

        System.out.println("Número de vogais na string: " + contagemVogais);

        scanner.close();
    }

    public static int contarVogais(String texto) {
        int contagem = 0;
        texto = texto.toLowerCase(); // Converter para minúsculas para facilitar a comparação

        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contagem++;
            }
        }

        return contagem;
    }
}
