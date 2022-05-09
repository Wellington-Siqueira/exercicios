package banco;

public class Cliente {
    private final String nome;
    private int telefone;
    private final String cpf;

    public Cliente(String nome, int telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
