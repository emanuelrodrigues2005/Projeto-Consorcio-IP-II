import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Contemplacao {
    private Cliente clienteContemplado;
	private LocalDate dataSorteio;
	private GrupoConsorcio grupoContemplacao; 


	public Contemplacao(Cliente clienteContemplado, LocalDate dataSorteio, GrupoConsorcio grupoContemplacao) {
		this.clienteContemplado = clienteContemplado;
		this.dataSorteio = dataSorteio;
		this.grupoContemplacao = grupoContemplacao;
	}
	int valid;
	ArrayList<Contrato> listaContratos;

	public void sorteio(GrupoConsorcio grupoContrato){
		for (Contrato contrato : grupoContrato.getListaContratos()) {
			if ("ATIVO".equals(contrato.getStatusContrato())) { //verificar essa questão do enum
                valid = 1;
            }
	   else{
		System.out.println("Essa operação não é possível!!");
	}
	if(valid == 1){
		 Random random = new Random();
         int indiceSorteado = random.nextInt(listaContratos.size());
         Contrato contratoSorteado = listaContratos.get(indiceSorteado);
		 clienteContemplado = contratoSorteado.getCliente();
		 registro(clienteContemplado, grupoContrato);
	}
}
	}
	public void registro(Cliente cliente, GrupoConsorcio grupo){
		Contemplacao r_contemplacao = new Contemplacao(cliente, java.time.LocalDate.now(), grupoContemplacao);
		grupoContemplacao.adicionarContemplacao(r_contemplacao);
		System.out.println("Cliente: " + clienteContemplado.getNome() + ", do Grupo: " + grupoContemplacao.getNomeGrupo() + ", foi adicionado ao Histórico de Contemplações.");
	}
	public void historicoContemplacao(GrupoConsorcio grupoContemplacao){
		ArrayList <Contemplacao> historico = grupoContemplacao.getHistoricoContemplacao();
		if(historico.isEmpty()){
			System.out.println("Não há histórico de contemplações para este grupo.");
		}
		else{
			System.out.println("Histórico de Contemplações do Grupo: " + grupoContemplacao.getNomeGrupo());
            System.out.println("-----------------------------------------------");
        for (Contemplacao contemplacao : historico) {
            System.out.println("Cliente: " + contemplacao.getClienteContemplado().getNome());
            System.out.println("CPF: " + contemplacao.getClienteContemplado().getCpf());
            System.out.println("Data do Sorteio: " + contemplacao.getDataSorteio());
            System.out.println("-----------------------------------------------");
              }
		    }
	}

	public Cliente getClienteContemplado() {
		return clienteContemplado;
	}


	public void setClienteContemplado(Cliente clienteContemplado) {
		this.clienteContemplado = clienteContemplado;
	}


	public LocalDate getDataSorteio() {
		return dataSorteio;
	}


	public void setDataSorteio(LocalDate dataSorteio) {
		this.dataSorteio = dataSorteio;
	}


	public GrupoConsorcio getGrupoContemplacao() {
		return grupoContemplacao;
	}


	public void setGrupoContemplacao(GrupoConsorcio grupoContemplacao) {
		this.grupoContemplacao = grupoContemplacao;
	}
	
}
