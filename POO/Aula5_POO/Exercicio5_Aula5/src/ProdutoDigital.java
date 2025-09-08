import java.util.Scanner;

public class ProdutoDigital extends Item implements IProduto {
    Scanner sc = new Scanner(System.in);

    public ProdutoDigital(String nome, double preco, Tipo tipo) {
        super(nome, preco, tipo);
    }

    @Override
    public double calcularPreco() {
        return super.calcularPreco();
    }


}
