import java.util.ArrayList;

import Enums.StatusGrupo; 

public class GrupoConsorcio {

    private String nomeGrupo;
    private double valorTotal;
    private int numeroParticipantes;
    private double taxaAdmin;
    private StatusGrupo status;
    private ArrayList<Contrato> listaContratos; //?????????w

    public GrupoConsorcio(String nomeGrupo, double valorTotal, int numeroParticipantes,
     double taxaAdmin, StatusGrupo status, ArrayList<Contrato> listaContratos)  {

        this.nomeGrupo = nomeGrupo;
        this.valorTotal = valorTotal;
        this.numeroParticipantes = numeroParticipantes;
        this.taxaAdmin = taxaAdmin;
        this.status = status;
        this.listaContratos = listaContratos;
    }

    public double calcularParcelas() {
        return this.valorTotal / this.numeroParticipantes;
    }

    public void atualizarTaxaAdministracao(double novaTaxa) {
        this.taxaAdmin = novaTaxa;
    }

    protected void encerrarContrato(StatusGrupo status) {
        this.status = status;
    }
}

