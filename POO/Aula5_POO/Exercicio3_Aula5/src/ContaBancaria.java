public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito){
       setSaldo(getSaldo() + deposito);
        System.out.println("O novo saldo é de: "+getSaldo());
    }
    public void depositar(double deposito, String descricao){
        setSaldo(getSaldo() + deposito);
        System.out.println("O novo saldo é de: "+getSaldo()+ " Descrição: "+descricao);
    }
    public void sacar(double saque){
        if(saque < getSaldo()){
            setSaldo(getSaldo() - saque);
            System.out.println("O novo saldo é de: "+getSaldo());
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void sacar(double saque, double taxaAdicional){
        if((saque+(saque*(taxaAdicional/100)) < getSaldo())){
            setSaldo(getSaldo() - (saque+(saque*(taxaAdicional*100))));
            System.out.println("O novo saldo é de: "+getSaldo());
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
