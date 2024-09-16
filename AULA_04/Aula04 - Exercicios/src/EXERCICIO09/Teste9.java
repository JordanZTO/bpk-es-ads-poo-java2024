public class Teste9 {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2500.0, 10);
        produto.aumentarEstoque(5);
        produto.diminuirEstoque(3);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
    }
}
