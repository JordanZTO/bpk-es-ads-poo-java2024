public class Cozinha {
    public String tipo;
    public int quantidadePessoas;
    public String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha está preparando a comida para " + quantidadePessoas + " pessoas.");
    }

    public void limpar() {
        System.out.println("A cozinha está sendo limpa.");
    }
}
