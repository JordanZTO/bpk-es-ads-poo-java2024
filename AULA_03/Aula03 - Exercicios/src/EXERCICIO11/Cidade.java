public class Cidade {
    public String nome;
    public int populacao;
    public String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            populacao += quantidade;
            System.out.println("A população de " + nome + " aumentou em " + quantidade + " habitantes.");
        } else {
            System.out.println("Quantidade inválida para aumentar a população.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("A população de " + nome + " diminuiu em " + quantidade + " habitantes.");
        } else {
            System.out.println("Quantidade inválida para diminuir a população.");
        }
    }
}
