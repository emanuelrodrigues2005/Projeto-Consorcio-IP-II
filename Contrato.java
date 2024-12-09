import Enums.StatusContrato;

public class Contrato {
    Cliente cliente;
    GrupoConsorcio grupoContrato;
    int parcelasPagas;
    double saldoDevedor;
    StatusContrato statusContrato;

    public Contrato(Cliente cliente, GrupoConsorcio grupoContrato, int parcelasPagas, double saldoDevedor, StatusContrato statusContrato) {
        this.cliente = cliente;
        this.grupoContrato = grupoContrato;
        this.parcelasPagas = parcelasPagas;
        this.saldoDevedor = saldoDevedor;
        this.statusContrato = statusContrato;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public GrupoConsorcio getGrupoContrato() {
        return grupoContrato;
    }

    public int getParcelasPagas() {
        return parcelasPagas;
    }

    public StatusContrato getStatusContrato() {
        return statusContrato;
    }

    public void pagarParcela(double valorParcela) {
        if (getSaldoDevedor() >= valorParcela) {
            saldoDevedor -= valorParcela;
            parcelasPagas++;

            if (saldoDevedor == 0) {
                statusContrato = StatusContrato.QUITADO;
            }
        } else {
            System.out.println("O valor da parcela excede o saldo devedor");
        }
    }
}
