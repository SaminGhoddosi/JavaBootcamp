public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double deposito, String descricao) {
        if(descricao.equalsIgnoreCase("especial")){
            double taxa = deposito * 0.1;
            setSaldo((getSaldo()+ deposito)-taxa);
        }else{
            setSaldo(getSaldo() + deposito);
        }
        System.out.println("O novo saldo é de: "+getSaldo()+ " Descrição: "+descricao);
    }
}
