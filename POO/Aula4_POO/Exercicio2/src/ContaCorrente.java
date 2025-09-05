public class ContaCorrente extends ContaBancaria{
    private double limite_cheque_especial;

    public ContaCorrente(double saldo, String titular, double limite_cheque_especial) {
        super(saldo, titular);
        this.limite_cheque_especial = limite_cheque_especial;
    }

    public double getLimite_cheque_especial() {
        return limite_cheque_especial;
    }

    public void setLimite_cheque_especial(double limite_cheque_especial) {
        this.limite_cheque_especial = limite_cheque_especial;
    }

    @Override
    public void sacar(){
        //eu poderia fazer super.sacar, mas aqui eu teria que reescrever parâmetros internos, então não funcionaria
        System.out.println("Quanto deseja sacar? ");
        double quantidade = sc.nextDouble();
        if(quantidade > getLimite_cheque_especial()){
            System.out.println("Quantidade acima do cheque especial");
        }else{
            double novoSaldo = this.getSaldo() - quantidade;
            if(novoSaldo < 0){
                System.out.println("Saque muito alto. Não tem tanto dinheiro");
            }else{
                setSaldo(novoSaldo);
                System.out.println("O saldo ficou de: "+this.getSaldo());
            }
        }

    }
}
