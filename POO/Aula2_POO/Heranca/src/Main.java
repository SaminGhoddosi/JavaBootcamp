public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Hascarasca","123",2,3,"Flex");
        Carro c2 = new Carro("Hascarasca","456",2000,2,"Flex#");
        Moto m1 = new Moto("adf","532",532,1);
        Moto m2 = new Moto("adf","532",532,1);
        m1._temBagageiro = true;
        System.out.println(c1.informacoes());
        System.out.println(m2.informacoes());
    }
}