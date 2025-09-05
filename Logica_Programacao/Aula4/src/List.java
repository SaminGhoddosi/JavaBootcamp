import java.sql.SQLOutput;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Escolha um exercício entre 1 e 38. Digite 0 para sair:  ");
            String escolha = scanner.next();
            switch (escolha) {
                case "0": {
                    System.out.println("Saindo do sistema");
                    break;
                }
                case "1": {
                    Exercicio1(scanner);
                    break;
                }
                case "2":
                {
                    Exercicio2(scanner);
                }
                case "5":
                    Exercicio5(scanner);
                    break;
                default:
                    System.out.print("ou");
                    break;
            }
            Clear(scanner, escolha);
            if (escolha.equals("0")) {
                break;
            }
        } while (true);
        System.out.println("Obrigado e até");
    }

    public static void Clear(Scanner scan, String escolha) {
        if (!escolha.equals("0")) {
            System.out.println("---Digite qualquer coisa na tela para continuar--");
            scan.next();
            for (int i = 0; i < 10; i++) {
                System.out.println();
            }
        }
    }

    public static void Exercicio1(Scanner scan) {
        System.out.println("---uma nota entre zero e dez---");
        System.out.print("Digite uma nota entre e dez: ");
        int numero = scan.nextInt();
        do {
            if (numero < 0 || numero > 10) {
                System.out.println("Opção inválida, tente novamente!");
                System.out.print("Número entre 1 e 10: ");
                numero = scan.nextInt();
            }
        } while (numero < 0 || numero > 10);
        System.out.println("A nota é de: " + numero);
    }

    public static void Exercicio2(Scanner scan) {
        System.out.println("---Usuário e senha diferentes---");
        String usuario = "";
        String senha = "";
        do {
            System.out.print("Digite o seu usuário: ");
            usuario = scan.next().toLowerCase();
            System.out.print("Digite a sua senha: ");
            senha = scan.next().toLowerCase();
            if (usuario.equals(senha)) {
                System.out.println("Usuário e senha não podem ser iguais!");
            }
        } while (usuario.equals(senha));
        System.out.println("Cadastro feito!");
    }

    public static void Exercicio3(Scanner scan) {
        System.out.println("---Valide as informações---");
        do {
            System.out.print("Digite o seu nome: ");
            String nome = scan.next();
            System.out.print("Digite a sua idade: ");
            int idade = scan.nextInt();
            System.out.print("Digite o seu salário; ");
            double salario = scan.nextDouble();
            System.out.print("Digite o seu sexo: ");
            String sexo = scan.next();
            System.out.print("Digite o seu estado civil: ");
            String estadoCivil = scan.next();
            if (nome.length() < 3 && (idade > 0 && idade < 150) && salario > 0 && "fm".contains(sexo) && "scvd".contains(estadoCivil)) {
                System.out.println("Ops, digitou algo errado!");
                break;

            }
        } while (true);
    }

    public static void Exercicio4(Scanner scan) {
        System.out.println("---País A e País B---");
        double populacaoA = 80000;
        double populacaoB = 200000;
        double crescimentoA = 3;
        double crescimentoB = 1.5;
        int numeroAno = 0;
        do {
            populacaoA = populacaoA + (populacaoA * (crescimentoA / 100));
            numeroAno++;
            populacaoB = populacaoB + (populacaoB * (crescimentoB / 100));
        } while (populacaoA <= populacaoB);
        System.out.println((populacaoA > populacaoB ? "População A(" + Math.round(populacaoA) + ") levou " + numeroAno + " anos para ultrapassar a população de (" + Math.round(populacaoB) + ") do país B" : "População A(" + Math.round(populacaoA) + ") levou " + numeroAno + " anos para igualar a população de " + Math.round(populacaoB) + " do país B"));

    }

    public static void Exercicio5(Scanner scan) {
        System.out.println("---País A e País B com opção---");
        String operacao;
        do {
            TaxaCrescimento(scan);
            System.out.println("Você gostaria de refazer a operação?");
            operacao = scan.next().toUpperCase();
        } while (operacao.equals("S"));
        System.out.println("tchau");


    }

    public static void TaxaCrescimento(Scanner scan) {
        System.out.print("Digite a população do país A: ");
        double populacaoA = scan.nextDouble();
        System.out.print("Digite o crescimento populacional do país A em %: ");
        double porcentagemA = scan.nextDouble();
        System.out.print("Digite a população do país B: ");
        double populacaoB = scan.nextDouble();
        System.out.print("Digite o crescimento populacional do país B em %: ");
        double porcentagemB = scan.nextDouble();
        int numeroAno = 0;
        do {
            populacaoA = populacaoA + (populacaoA * (porcentagemA / 100));
            numeroAno++;
            populacaoB = populacaoB + (populacaoB * (porcentagemB / 100));
        } while (populacaoA <= populacaoB);
        System.out.println((populacaoA > populacaoB ? "População A(" + Math.round(populacaoA) + ") levou " + numeroAno + " anos para ultrapassar a população de (" + Math.round(populacaoB) + ") do país B" : "População A(" + Math.round(populacaoA) + ") levou " + numeroAno + " anos para igualar a população de " + Math.round(populacaoB) + " do país B"));
    }

    public static void Exercicio7(Scanner scan) {
        System.out.println("---O maior número entre 5---");
        int maiornumero = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scan.nextInt();
            if (numero > maiornumero) {
                maiornumero = numero;
            }
        }
        System.out.println("O maior número é: " + maiornumero);
    }

    public static void Exercicio15(Scanner scan) {
        System.out.println("---Fibonacci---");
        int numero1 = 0;
        int numero2 = 1;
        System.out.print("Qual a quantidade de termos que quer?: ");
        int termo = scan.nextInt();

        System.out.println("O termo: 1 é o número: " + numero1);

        for (int i = 1; i < termo; i++) {
            System.out.println("O termo: " + (i + 1) + " é o número: " + numero2);
            int proximo = numero1 + numero2;
            numero1 = numero2;
            numero2 = proximo;
        }
    }//estudar esse!

    public static void Exercicio38(Scanner scan) {
        //fazer
    }//estudar for, vetor e lista, matrizes
}
