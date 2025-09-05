public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1000,"Eu",1000);
        ContaPoupanca c2 = new ContaPoupanca(1000,"Eu",10);
        c1.depositar();
        c2.sacar();
        c2.aplicar_juros();
    }
}