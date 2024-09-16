public class Teste12{
    public static void main(String[] args) {
        Filme filme = new Filme("Inception", "Christopher Nolan", 148);
        filme.iniciar();
        filme.parar();
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");
    }
}
