public class Filme {
    public String titulo;
    public String diretor;
    public int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar() {
        System.out.println("O filme " + titulo + " está começando.");
    }

    public void parar() {
        System.out.println("O filme " + titulo + " foi pausado.");
    }
}
