public class Main {
    public static void main(String[] args) {
         Produto p1 = new Produto("Batata",10,2);
         Produto p2 = new Produto("Morango",30,5);
         Produto p3 = new Produto("Batata",20,7);
         p1.adiconarEstoque(10);
         p2.adiconarEstoque(10,2);
         p3.adiconarEstoque(10,2);
    }
}