package Models;

import Enums.StatusContratoEnum;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contrato {
    private Cliente cliente;
    private GrupoConsorcio grupoAssociado;
    private int parcelasPagas;
    private double saldoDevedor;
    private LocalDate dataContemplação;
    private StatusContratoEnum statusContrato;
    private ArrayList<Boleto> listaBoletosPagos;

    public Contrato(Cliente cliente, GrupoConsorcio grupoAssociado) {
        this.cliente = cliente;
        this.grupoAssociado = grupoAssociado;
        this.parcelasPagas = 0;
        this.saldoDevedor = grupoAssociado.getValorTotal();
        this.statusContrato = StatusContratoEnum.ATIVO;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public GrupoConsorcio getGrupoAssociado() {
        return grupoAssociado;
    }

    public int getParcelasPagas() {
        return parcelasPagas;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public LocalDate getDataContemplação() {
        return dataContemplação;
    }

    public void setDataContemplação(LocalDate dataContemplação) {
        this.dataContemplação = dataContemplação;
    }

    public StatusContratoEnum getStatusContrato() {
        return statusContrato;
    }

    public ArrayList<Boleto> getListaBoletosPagos() {
        return listaBoletosPagos;
    }
}