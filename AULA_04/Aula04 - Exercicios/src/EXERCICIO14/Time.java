public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogador(int quantidade) {
        if (quantidade > 0) {
            numeroDeJogadores += quantidade;
            System.out.println(quantidade + " jogador(es) adicionado(s) ao time " + nome + ".");
        } else {
            System.out.println("Quantidade inválida para adicionar jogadores.");
        }
    }

    public void removerJogador(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroDeJogadores) {
            numeroDeJogadores -= quantidade;
            System.out.println(quantidade + " jogador(es) removido(s) do time " + nome + ".");
        } else {
            System.out.println("Quantidade inválida para remover jogadores.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }
}
