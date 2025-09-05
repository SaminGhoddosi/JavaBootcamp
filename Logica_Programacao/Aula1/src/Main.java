import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo");
        System.out.println("Tchau");
        String nome;
        nome = "Domingos";
        System.out.println(nome);
        int idade = 106;
        System.out.println("Idade é de: " + idade + " anos");
        double salario = 15000;
        System.out.println("Salário: R$" + salario);

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome2 = scan.next();
        System.out.println("Seu nome é: " + nome2);// existem várias opções de next
        System.out.println("Onde você mora?");
        String cidade = scan.nextLine();
        System.out.println("Qual é a sua idade?");
        int idade2 = scan.nextInt();
//como desfazer comentário de tudo o que selecionei?

//  1 -
        System.out.print("Digite a altura do retângulo: ");
        double altura = scan.nextInt();
        System.out.print("Digite a base do retângulo: ");
        double base = scan.nextDouble();
        double area = altura * base;
        System.out.println("A área do retângulo é de: " + area + "m²");

    }
}