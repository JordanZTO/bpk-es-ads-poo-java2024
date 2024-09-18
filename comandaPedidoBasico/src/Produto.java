public class Produto {
    private Integer numeroProduto;
    private String descricaoProduto;
    private Double valorProduto;

    public Produto(Integer numeroProduto, String descricaoProduto, Double valorProduto) {
        this.numeroProduto = numeroProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public Integer getNumeroProduto() {
        return numeroProduto;
    }

    public void setNumeroProduto(Integer numeroProduto) {
        this.numeroProduto = numeroProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }
}
