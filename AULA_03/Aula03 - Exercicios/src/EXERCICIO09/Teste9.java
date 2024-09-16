public class Teste9 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.0, 10);

        produto1.aumentarEstoque(5);
        produto1.diminuirEstoque(3);
    }
}
