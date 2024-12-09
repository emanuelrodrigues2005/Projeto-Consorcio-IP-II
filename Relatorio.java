import java.time.LocalDate;
import java.util.List;

public class Relatorio {
    private List<Contrato> contratosAtivos;
    private List<Pagamento> pagamentosRealizados;
    private List<Contemplacao> contemplacoes;
    private GrupoConsorcio grupo;

    public Relatorio(List<Contrato> contratosAtivos, List<Pagamento> pagamentosRealizados, List<Contemplacao> contemplacoes, GrupoConsorcio grupo) {
        this.contratosAtivos = contratosAtivos;
        this.pagamentosRealizados = pagamentosRealizados;
        this.contemplacoes = contemplacoes;
        this.grupo = grupo;
    }

    // Requisito 8 de consulta > gustavo
    public void gerarHistoricoContemplacoes() {
        System.out.println("Histórico de Contemplações do Grupo: " + grupo.getNomeGrupo());
        for (Contemplacao contemplacao : grupo.getHistoricoContemplacao()) {
            System.out.println("Data: " + contemplacao.getDataSorteio());
            System.out.println("Cliente Contemplado: " + contemplacao.getClienteContemplado().getNome());
            System.out.println("Status do Grupo: " + (grupo.getListaContratos().size() == grupo.getNumeroParticipantes() ? "Completo" : "Em Andamento"));
        }
    }

    // Requisito 9 de saldo devedor > gustavo
    public void gerarRelatorioSaldoDevedor() {
        System.out.println("Relatório de Saldo Devedor do Grupo: " + grupo.getNomeGrupo());
        for (Contrato contrato : grupo.getListaContratos()) {
            System.out.println("Cliente: " + contrato.getCliente().getNome());
            System.out.println("Saldo Devedor: " + contrato.getSaldoDevedor());
        }
    }

    // Requisito 10 de estatísticas financeiras > gustavo
    public void exibirEstatisticasFinanceiras() {
        double valorArrecadado = pagamentosRealizados.stream().mapToDouble(Pagamento::getValorPago).sum();
        double valorPendente = contratosAtivos.stream().mapToDouble(Contrato::getSaldoDevedor).sum();

        System.out.println("Estatísticas Financeiras do Grupo: " + grupo.getNomeGrupo());
        System.out.println("Valor Total Arrecadado: " + valorArrecadado);
        System.out.println("Valor Total Pendente: " + valorPendente);
    }
}
    // Requisitos 11 e 12 serão realizados posteriormente
