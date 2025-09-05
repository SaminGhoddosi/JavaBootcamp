import java.util.Scanner;

public abstract class ContaBancaria {
    Scanner sc = new Scanner(System.in);

    private String titular;
    private double saldo;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
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

    public void depositar(){
        System.out.println("Quanto deseja depositar? ");
        double quantidade = sc.nextDouble();
        setSaldo(this.getSaldo()+quantidade);
        System.out.println("O saldo ficou de: "+this.getSaldo());
    };
    public void sacar(){
        System.out.println("Quanto deseja sacar? ");
        double quantidade = sc.nextDouble();
        double novoSaldo = this.getSaldo() - quantidade;
        if(novoSaldo < 0){
            System.out.println("Saque muito alto. Não tem tanto dinheiro");
        }else{
            setSaldo(novoSaldo);
            System.out.println("O saldo ficou de: "+this.getSaldo());
        }

    };
    public void statusAtual(){
        System.out.println("Conta do cliente: "+getTitular() + " tem R$: "+getSaldo());
    };

}
