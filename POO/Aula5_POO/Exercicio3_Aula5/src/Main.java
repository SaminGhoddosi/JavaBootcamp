public class Main {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria(1000);
        ContaCorrente cc1 = new ContaCorrente(10000);
        cb1.depositar(100, "porque sim");
        cb1.sacar(100, 2);
        cc1.depositar(100, "especial");
    }
}