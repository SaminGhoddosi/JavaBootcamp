import java.util.Scanner;
public class ProdutoFisico extends Item implements IProduto{
    Scanner sc = new Scanner(System.in);

    public ProdutoFisico(String nome, double preco, Tipo tipo) {
       super(nome,preco,tipo);
    }
    @Override
    public  double calcularPreco(){
        System.out.println("Qual é o valor do frete do produto "+this.getNome()+"?:");
        double valorFrete = sc.nextDouble();
        double precoTotal = getPreco() + valorFrete;
        super.calcularPreco();
        return precoTotal;
    }


}
