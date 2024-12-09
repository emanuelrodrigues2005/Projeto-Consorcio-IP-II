import java.time.LocalDate;

public class Boleto {
    private Contrato contratoBoleto;
    private double valorBoleto;
    private LocalDate dataVencimento;
    private boolean statusBoleto;
//não lembro se precisava mas fiz um constructor
    public  Boleto(Contrato contratoBoleto, double valorBoleto, LocalDate dataVencimento) {
        this.contratoBoleto = contratoBoleto;
        this.valorBoleto = valorBoleto;
        this.dataVencimento = dataVencimento;
        this.statusBoleto = false;
    }
//msm coisa pros getters e setters
    public Contrato getContrato()
      {return contratoBoleto;}
    public double getValor()
      {return valorBoleto;}
    public LocalDate getDataVencimento()
      {return dataVencimento;}
    public boolean isStatusBoleto()
      {return statusBoleto;}

    public void printarBoleto() {
        System.out.println("Boleto gerado para o contrato: " + contratoBoleto);
        System.out.println("Valor do boleto: " + valorBoleto);
        System.out.println("Data de vencimento: " + dataVencimento);
        System.out.println("Status do boleto: " + (statusBoleto ? "Pago" : "Não Pago"));
    }
}

/*    class SistemaBoleto() {
        private List<Boleto> listaDeBoleto;

    public SistemaBoleto()
    {listaDeBoleto = new ArrayList<>();}
}

    public void adicionarBoleto(Boleto boletoFeito)
    {listaDeBoleto.add(boletoFeito);}

    public void navegadorBoletos() {
        for (Boleto boletoFeito : listaDeBoleto) {
            boletoFeito.printarBoleto();
        }
    }                */
