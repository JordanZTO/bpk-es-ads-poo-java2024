public class Teste17 {
    public static void main(String[] args) {
        Animal animal = new Animal("Leão", 5, 190.5);
        animal.alimentar();
        animal.dormir();
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + " kg");
    }
}
