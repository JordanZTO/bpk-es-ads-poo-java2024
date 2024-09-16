public class Teste14 {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Jorge Jesus", 22);
        time.adicionarJogador(3);
        time.removerJogador(2);
        System.out.println("Nome do time: " + time.getNome());
        System.out.println("Técnico: " + time.getTecnico());
        System.out.println("Número de jogadores: " + time.getNumeroDeJogadores());
    }
}
