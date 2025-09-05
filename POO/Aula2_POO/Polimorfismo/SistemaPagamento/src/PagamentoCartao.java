public class PagamentoCartao extends Pagamento {
    public String _numeroCartao;
    public PagamentoCartao(String numeroCartao, double valor){
        super(valor);
        this._numeroCartao = numeroCartao;
    }

    @Override
    public String processarPagamento(){
        return "Pagamento de "+_valor+" com cartão"+ _numeroCartao +"aprovado";
    }




}
