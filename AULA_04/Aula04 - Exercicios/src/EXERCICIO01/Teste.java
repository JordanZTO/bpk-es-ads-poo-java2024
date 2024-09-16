package EXERCICIO01;

public class Teste {

    public static void main(String[] args) {
        Livro livro = new Livro("Java para Iniciantes", "Maria Silva", 200);
        livro.abrirLivro();
        livro.lerPagina();
        livro.lendoPagina();
    }
}
