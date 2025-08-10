import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite sua nota 1: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite sua nota 2: ");
        double nota2 = scan.nextDouble();
        System.out.print("Digite sua nota 3: ");
        double nota3 = scan.nextDouble();
        System.out.print("Digite sua nota 4: ");
        double nota4 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média é de: " + String.format("%.1f", media));
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }
}