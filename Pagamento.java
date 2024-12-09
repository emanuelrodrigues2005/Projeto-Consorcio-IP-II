import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Atributos

public class Pagamento {
    private double valorPago;
    private LocalDate dataDePagamento;
    private Contrato contratoPagamento;

    //Construtor

    public Pagamento(Contrato contratoPagamento, double valorPago, LocalDate dataDePagamento) {
        this.contratoPagamento = contratoPagamento;
        this.valorPago = valorPago;
        this.dataDePagamento = dataDePagamento;

        realizarPagamento(); // Realiza o pagamento ao criar a instância
    }

    //Métodos
    
    public void realizarPagamento() {
        if (contratoPagamento != null) {
            contratoPagamento.pagarParcela(valorPago);
            System.out.println("Pagamento efetivado com sucesso.");// Chama a função pagarParcela se o contrato for válido
        } else {
            System.out.println("Pagamento não associado a um contrato.");
        }
    }

    public void exibirPagamento() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataDePagamento.format(formatador);

        System.out.println("Detalhes do Pagamento:");
        System.out.println("Data do pagamento: " + dataFormatada);
        System.out.println("Valor pago: R$ " + String.format("%.2f", valorPago));
    }
}
