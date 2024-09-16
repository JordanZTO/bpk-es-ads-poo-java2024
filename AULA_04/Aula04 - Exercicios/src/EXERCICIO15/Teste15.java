public class Teste15 {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("The Witcher 3", "RPG", 199.90);
        jogo.iniciar();
        jogo.pausar();
        System.out.println("Nome do jogo: " + jogo.getNome());
        System.out.println("Gênero: " + jogo.getGenero());
        System.out.println("Preço: R$ " + jogo.getPreco());
    }
}
