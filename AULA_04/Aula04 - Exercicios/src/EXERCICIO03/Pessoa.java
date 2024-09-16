package EXERCICIO03;

public class Pessoa {

    private String nome;
    private Double altura;
    private Integer idade;

    public Pessoa(String nome, Double altura, Integer idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void apresentacao() {
        System.out.println("Olá. Me chamo " + nome + ", tenho " + altura + " de altura e tenho " + idade + " anos.");
    }
}
