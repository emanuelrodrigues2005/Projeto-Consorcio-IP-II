package Models;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Contrato contrato;

    public Cliente(String nome, String cpf, String telefone, String email, Contrato contrato) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.contrato = contrato;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Contrato getContrato() {
        return contrato;
    }
}