package EXERCICIO03;

public class Pessoa {

    public String nome;
    public Double altura;
    public Integer idade;

    public Pessoa(String nome, Double altura, Integer idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public void apresentacao(){
        System.out.println("Ola. Me chamo " + " " + nome + " " + "tenho " + altura + " " + "de altura " + "e tenho " + idade + " anos");
        }
}
