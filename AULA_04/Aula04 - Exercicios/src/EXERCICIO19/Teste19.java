public class Teste19 {
    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Java para Iniciantes", "Carlos Silva", 5.4);
        livro.abrir();
        livro.fechar();
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Tamanho do arquivo: " + livro.getTamanhoArquivo() + " MB");
    }
}
