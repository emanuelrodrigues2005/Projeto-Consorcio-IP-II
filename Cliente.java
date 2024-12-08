public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public boolean validarCPF() {

        String cpfNumerico = cpf.replaceAll("\\D", ""); // ???? emanuel é maluco

        if (cpfNumerico.length() != 11) {
            return false;
        }

        return verificarDigito(cpfNumerico, 9) && verificarDigito(cpfNumerico, 10);
    }

    private boolean verificarDigito(String cpf, int posicao) {
        int soma = 0;
        int pesoInicial = posicao + 1;

        for (int i = 0; i < posicao; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * pesoInicial--;
        }

        int resto = soma % 11;
        int digitoCalculado = resto < 2 ? 0 : 11 - resto;

        return digitoCalculado == Character.getNumericValue(cpf.charAt(posicao));
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
