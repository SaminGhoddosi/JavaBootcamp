public class PagamentoBoleto extends Pagamento {
    public String _codigoBarras;
    public PagamentoBoleto(String codigoBarras, double valor){
        super(valor);
        this._codigoBarras = codigoBarras;
    }

    @Override
    public String processarPagamento(){
        return "Pagamento de "+_valor+" com boleto"+ _codigoBarras +"aprovado";
    }




}
