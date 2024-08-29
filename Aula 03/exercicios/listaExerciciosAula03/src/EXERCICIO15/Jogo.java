public class Jogo {
    public String nome;
    public String genero;
    public double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("O jogo " + nome + " está começando.");
    }

    public void pausar() {
        System.out.println("O jogo " + nome + " foi pausado.");
    }
}
