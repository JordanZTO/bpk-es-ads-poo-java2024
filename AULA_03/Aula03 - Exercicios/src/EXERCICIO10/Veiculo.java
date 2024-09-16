public class Veiculo {
    public String tipo;
    public String placa;
    public String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("O veículo de placa " + placa + " está sendo abastecido.");
    }

    public void lavar() {
        System.out.println("O veículo de placa " + placa + " está sendo lavado.");
    }
}
