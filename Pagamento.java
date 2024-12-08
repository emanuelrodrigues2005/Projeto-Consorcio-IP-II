import java.time.LocalDate;

// Atributos
public class Pagamento {
    private double valorPago;
    private LocalDate dataDePagamento;
    private Contrato contratoPagamento;

    // Métodos
    public Pagamento(Contrato contratoPagamento, double valorPago, LocalDate dataDePagamento) {
        this.contratoPagamento = contratoPagamento;
        this.valorPago = valorPago;
        this.dataDePagamento = dataDePagamento;

        realizarPagamento(); // Realiza o pagamento ao criar a instância
    }

    public void realizarPagamento() {
        if (contratoPagamento != null) {
            contratoPagamento.pagarParcela(valorPago); // Chama a função pagarParcela se o contrato for válido
            System.out.println("Pagamento efetivado com sucesso.");
        } else {
            System.out.println("Pagamento não associado a um contrato.");
        }
    }

    public double getValorPago() {
        return valorPago;
    }

    public LocalDate getDataDePagamento() {
        return dataDePagamento;
    }

    public Contrato getContratoPagamento() {
        return contratoPagamento;
    }
}
