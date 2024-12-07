import java.util.ArrayList;

public class GrupoConsorcio {
    private String nomeGrupo;
    private double valorTotal;
    private int numeroParticipantes;
    private double taxaAdmin;
    private boolean status; 
    private ArrayList<Contrato> listaContratos; //?????????w

    
    public double calcularParcelas() {
        return this.valorTotal / this.numeroParticipantes;
    }

    public void atualizarTaxaAdministracao(double novaTaxa) {
        this.taxaAdmin = novaTaxa;
    }

    protected void encerrarGrupo() {
        this.status = false;
    }

}

