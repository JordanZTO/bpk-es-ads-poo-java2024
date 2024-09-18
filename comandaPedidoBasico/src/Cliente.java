public class Cliente {
    private String nome;
    private String cpf;
    private EnderecoCliente enderecoCliente;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoCliente getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(EnderecoCliente enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
}
