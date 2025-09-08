public abstract class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        setSaldo(getSaldo()+valor);
        System.out.println("O novo saldo é de: "+ getSaldo());
    }
    public void consultarSaldo(){
        System.out.println("O saldo é de: "+saldo);
    }
    public abstract void sacar(double valor);
}
