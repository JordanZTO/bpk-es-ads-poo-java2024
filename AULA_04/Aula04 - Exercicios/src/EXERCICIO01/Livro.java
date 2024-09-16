package EXERCICIO01;

import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;
    private Integer paginas;
    private Integer paginaAtual;

    public Livro(String titulo, String autor, Integer paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.paginaAtual = 1;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public Integer getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(Integer paginaAtual) {
        if (paginaAtual > 0 && paginaAtual <= paginas) {
            this.paginaAtual = paginaAtual;
        } else {
            System.out.println("Página inválida!");
        }
    }

    public void abrirLivro() {
        System.out.println("Livro: " + getTitulo() + " - Autor: " + getAutor() + " - Total de páginas: " + getPaginas());
    }

    public void lerPagina() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual página deseja ler?");
        int pagina = scanner.nextInt();
        setPaginaAtual(pagina);
    }

    public void lendoPagina() {
        if (getPaginaAtual() <= getPaginas()) {
            System.out.println("Lendo a página " + getPaginaAtual());
            if (paginaAtual < paginas) {
                paginaAtual++;
            } else {
                System.out.println("Você já está na última página.");
            }
        } else {
            System.out.println("O Livro já foi finalizado!");
        }
    }
}
