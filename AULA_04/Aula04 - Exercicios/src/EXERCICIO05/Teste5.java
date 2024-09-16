public class Teste5 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", "Labrador", 3);
        cachorro.latir();
        cachorro.correr();
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade() + " anos");
    }
}
