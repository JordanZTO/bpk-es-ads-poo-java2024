public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque de " + nome + " aumentado em " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade inválida para aumentar o estoque.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Estoque de " + nome + " diminuído em " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade inválida para diminuir o estoque.");
        }
    }
}
