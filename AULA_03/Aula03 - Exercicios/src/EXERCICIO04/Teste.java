public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(12345, 1000.0);

        conta1.depositar(500.0);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());

        conta1.sacar(300.0);
        System.out.println("Saldo atual: R$ " + conta1.getSaldo());

        conta1.sacar(1500.0);
    }
}
