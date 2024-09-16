public class Bicicleta {
    public String marca;
    public String modelo;
    public double tamanhoRoda;

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("A bicicleta " + modelo + " está pedalando.");
    }

    public void frear() {
        System.out.println("A bicicleta " + modelo + " está freando.");
    }
}
