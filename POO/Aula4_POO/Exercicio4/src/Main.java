public class Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(10, "samin", 102.2, 10);
        Gerente g1 = new Gerente(10, "samin", 102.2, 10);
        System.out.println(g1.calcular_salario_mensal());
        System.out.println(v1.calcular_salario_mensal());

    }
}