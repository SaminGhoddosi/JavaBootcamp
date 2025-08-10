import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual é o nome do produto?: ");
        String produto = scan.next();
        System.out.print("Qual é o preço do " + produto + "?: ");
        double preco = scan.nextDouble();
        double desconto = preco * 0.3;
        double precoDesconto = preco - desconto;
        System.out.println("O preço do " + produto + " com o desconto fica de: " + String.format("%.2f", precoDesconto) + " reais.");
        System.out.println("O desconto é de R$:" + desconto);
    }//O menor código pode não ser o mais limpo. Não ficar empacotando
}