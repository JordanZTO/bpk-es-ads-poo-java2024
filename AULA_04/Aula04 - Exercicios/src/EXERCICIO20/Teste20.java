public class Teste20 {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Explorer", 29.0);
        bicicleta.pedalar();
        bicicleta.frear();
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Tamanho da roda: " + bicicleta.getTamanhoRoda() + " polegadas");
    }
}

