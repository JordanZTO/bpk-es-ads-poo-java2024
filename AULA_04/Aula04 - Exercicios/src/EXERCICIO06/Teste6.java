public class Teste6 {
    public static void main(String[] args) {
        Computador computador = new Computador("Intel i7", 16, 512);
        computador.ligar();
        computador.desligar();
        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("Memória RAM: " + computador.getMemoriaRAM() + "GB");
        System.out.println("Armazenamento: " + computador.getArmazenamento() + "GB");
    }
}
