public class Teste21 {
    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Moderna", 4, "Branca");
        cozinha.cozinhar();
        cozinha.limpar();
        System.out.println("Tipo de cozinha: " + cozinha.getTipo());
        System.out.println("Quantidade de pessoas: " + cozinha.getQuantidadePessoas());
        System.out.println("Cor: " + cozinha.getCor());
    }
}

