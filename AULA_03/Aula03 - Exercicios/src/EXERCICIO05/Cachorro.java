public class Cachorro {
    public String nome;
    public String raca;
    public int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " está latindo!");
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }
}
