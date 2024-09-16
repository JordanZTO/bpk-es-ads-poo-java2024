public class Computador {
    public String processador;
    public int memoriaRAM;
    public int armazenamento;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public void ligar() {
        System.out.println("O computador está ligando...");
    }

    public void desligar() {
        System.out.println("O computador está desligando...");
    }
}
