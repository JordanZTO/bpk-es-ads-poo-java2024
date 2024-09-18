public class Pedido {
    private Integer numeroPedido;
    private Integer quantidade;
    private Double valorFinal;
    private Produto produto;
    private Cliente cliente;

    public Pedido(Integer numeroPedido, Integer quantidade) {
        this.numeroPedido = numeroPedido;
        this.quantidade = quantidade;
        this.valorFinal = 0.0;
    }

    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Produto getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;


    }
}
