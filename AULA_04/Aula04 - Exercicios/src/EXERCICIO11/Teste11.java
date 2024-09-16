public class Teste11 {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");
        cidade.aumentarPopulacao(5000);
        cidade.diminuirPopulacao(2000);
        System.out.println("Nome da cidade: " + cidade.getNome());
        System.out.println("População: " + cidade.getPopulacao());
        System.out.println("Estado: " + cidade.getEstado());
    }
}
