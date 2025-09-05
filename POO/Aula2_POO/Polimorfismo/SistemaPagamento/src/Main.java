import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
        PagamentoCartao pc1 = new PagamentoCartao("1233",123);
        PagamentoBoleto pb1 = new PagamentoBoleto("1233",123);
        pagamentos.add(pc1);
        pagamentos.add(pb1);
        for(Pagamento pagamentos1 : pagamentos){
            System.out.println(pagamentos1.processarPagamento());
        }
    }
}