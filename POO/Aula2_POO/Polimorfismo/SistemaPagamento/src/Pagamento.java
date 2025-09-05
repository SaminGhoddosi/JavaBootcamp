public abstract class Pagamento {
    public double _valor;
    public Pagamento(double valor){
        this._valor = valor;
    }

    public abstract String processarPagamento();

}
