public class Teste16 {
    public static void main(String[] args) {
        Loja loja = new Loja("Supermercado ABC", "Rua Principal, 123", "(11) 1234-5678");
        loja.abrir();
        loja.fechar();
        System.out.println("Nome da loja: " + loja.getNome());
        System.out.println("Endereço: " + loja.getEndereco());
        System.out.println("Telefone: " + loja.getTelefone());
    }
}
