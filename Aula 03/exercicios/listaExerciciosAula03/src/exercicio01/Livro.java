package EXERCICIO01;
import java.util.Scanner;

/*1 - Crie uma classe chamada Livro com atributos como titulo, autor, e numeroDePaginas. Adicione métodos para abrir o livro e ler uma página.*/

public class Livro {

    Scanner scanner = new Scanner(System.in);

    public String titulo;
    public String autor;
    public Integer paginas;
    public Integer paginaAtual;

    public Livro(String titulo, String autor, Integer paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.paginaAtual = 0;
    }

    public void abrirLivro() {
        System.out.println("Livro: " + titulo + " " + autor + " " + paginas);

    }

    public void lerPagina() {
        System.out.println("Qual pagina deseja ler?");
        paginaAtual = scanner.nextInt();
    }

    public void lendoPagina() {
        if (paginaAtual <= paginas) {
            System.out.println("Lendo a pagina " + paginaAtual);
            paginaAtual++;
        } else {
            System.out.println("O Livro ja foi finalizado!");
        }
    }
}

