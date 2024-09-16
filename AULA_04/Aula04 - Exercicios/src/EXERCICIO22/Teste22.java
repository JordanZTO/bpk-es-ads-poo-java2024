public class Teste22 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-99", 50);
        empresa.contratar(5);
        empresa.demitir(3);
        System.out.println("Nome da empresa: " + empresa.getNome());
        System.out.println("CNPJ: " + empresa.getCNPJ());
        System.out.println("Número de funcionários: " + empresa.getNumeroFuncionarios());
    }
}

