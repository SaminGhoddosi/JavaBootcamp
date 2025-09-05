public class ContaPoupanca extends ContaBancaria {
    private int taxa_juros;

    public int getTaxa_juros() {
        return taxa_juros;
    }

    public void setTaxa_juros(int taxa_juros) {
        this.taxa_juros = taxa_juros;
    }

    public ContaPoupanca(double saldo, String titular, int taxa_juros) {
        super(saldo, titular);
        this.taxa_juros = taxa_juros;

    }

    public void aplicar_juros(){
        double novoSaldo = getSaldo() + (getSaldo()*getTaxa_juros()/100.0);
        setSaldo(novoSaldo);
        System.out.println("Com a taxa de: "+ getTaxa_juros()+ " Ficou: "+getSaldo());
    }
}
