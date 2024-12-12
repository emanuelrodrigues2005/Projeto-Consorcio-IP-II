package Models;

import Enums.StatusBoletoEnum;

import java.time.LocalDate;

public class Boleto {
    private Contrato contratoBoleto;
    private double valorBoleto;
    private LocalDate dataVencimento;
    private LocalDate dataPagamento;
    private StatusBoletoEnum statusBoleto;

    public Boleto(Contrato contratoBoleto, LocalDate dataVencimento) {
        this.contratoBoleto = contratoBoleto;
        this.dataVencimento = dataVencimento;
        this.statusBoleto = StatusBoletoEnum.PENDENTE;
        this.valorBoleto = contratoBoleto.getGrupoAssociado().getValorParcela();
    }

    public Contrato getContrato() {
        return contratoBoleto;
    }

    public double getValorBoleto() {
        return valorBoleto;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public StatusBoletoEnum getStatusBoleto() {
        return statusBoleto;
    }

    public void setStatusBoleto(StatusBoletoEnum statusBoleto) {
        this.statusBoleto = statusBoleto;
    }
}