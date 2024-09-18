public class MainComanda {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Adrian", "123.166.059-74");
        EnderecoCliente endereco = new EnderecoCliente("Rua São José, 50 - Vila Pioneiro", "50", "Casa", "85909-160");
        Pedido pedido = new Pedido(1, 3);
        Produto produto = new Produto(3, "Cachorro Quente", 5.0);

        cliente.setEnderecoCliente(endereco);
        pedido.setCliente(cliente);
        pedido.setProduto(produto);

        System.out.println("\n\nDetalhes do cliente");
        System.out.println("Nome: " + pedido.getCliente().getNome() + "\nCPF: " + pedido.getCliente().getCpf());
        System.out.println("\nDetalhes endereço cliente");
        System.out.println("Endereço: " + pedido.getCliente().getEnderecoCliente().getLogradouro() + "\nNúmero endereço: " + pedido.getCliente().getEnderecoCliente().getNumero() + "\nComplemento: " + pedido.getCliente().getEnderecoCliente().getComplemento() + "\nCEP: " + pedido.getCliente().getEnderecoCliente().getCep());
        System.out.println("\nDetalhes pedido");
        System.out.println("Número do pedido: " + pedido.getNumeroPedido() + "\nNúmero do produto: " + pedido.getProduto().getNumeroProduto() + "\nNome produto: " + pedido.getProduto().getDescricaoProduto() + "\nQuantidade: " + pedido.getQuantidade() + "\nValor unidade: " + pedido.getProduto().getValorProduto());
        pedido.setValorFinal(pedido.getProduto().getValorProduto() * pedido.getQuantidade());
        System.out.println("Valor final: " + pedido.getValorFinal());
    }
}