public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar(int quantidade) {
        if (quantidade > 0) {
            numeroFuncionarios += quantidade;
            System.out.println(quantidade + " funcionário(s) contratado(s) na empresa " + nome + ".");
        } else {
            System.out.println("Quantidade inválida para contratar funcionários.");
        }
    }

    public void demitir(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroFuncionarios) {
            numeroFuncionarios -= quantidade;
            System.out.println(quantidade + " funcionário(s) demitido(s) da empresa " + nome + ".");
        } else {
            System.out.println("Quantidade inválida para demitir funcionários.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }
}
