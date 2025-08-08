import java.util.Scanner;
public class List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Escolha um exercício entre 3,4,7,15 e 38. Digite 0 para sair:  ");
            String escolha = sc.next();
            switch(escolha){
                case "0":
                    System.out.println("Saindo do sistema");
                    break;
                case "3":
                    Exercicio3(sc);
                    break;
                case "4":
                    Exercicio4(sc);
                    break;
                case "7":
                    Exercicio7(sc);
                    break;
                case "15":
                    Exercicio15(sc);
                    break;
                case "38":
                    Exercicio38(sc);
                    break;
            }
            Clear(sc,escolha);
            if(escolha.equals("0")){
                break;
            }
        }while(true);
        System.out.println("Obrigado e até");
    }
    public static void Clear(Scanner scan, String escolha){
        if(!escolha.equals("0")){
            System.out.println("---Digite qualquer coisa na tela para continuar--");
            scan.next();
            for(int i = 0;i<10;i++){
                System.out.println();
            }
        }
    }
    public static void Exercicio3(Scanner scan){
        do{
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
            if(nome.length()<3 && (idade>0 && idade<150) && salario>0 && "fm".contains(sexo) && "scvd".contains(estadoCivil)){
                System.out.println("Ops, digitou algo errado!");
                break;

            }
        }while(true);
    }
    public static void Exercicio4(Scanner scan){
        double populacaoA = 80000;
        double populacaoB = 200000;
        double crescimentoA = 3;
        double crescimentoB = 1.5;
        int numeroAno = 0;
       do{
           populacaoA = populacaoA+(populacaoA*(crescimentoA/100));
           numeroAno++;
           populacaoB = populacaoB+(populacaoB*(crescimentoB/100));
       }while(populacaoA <= populacaoB);
        System.out.println((populacaoA>populacaoB? "População A("+Math.round(populacaoA)+") levou "+numeroAno+" anos para ultrapassar a população de ("+Math.round(populacaoB)+") do país B": "População A("+Math.round(populacaoA)+") levou "+numeroAno+" anos para igualar a população de "+Math.round(populacaoB)+" do país B"));

    }
    public static void Exercicio7(Scanner scan){
        while(true){
            System.out.print("Digite o número 1: ");
            int numero1 = scan.nextInt();
            System.out.print("Digite o número 2: ");
            int numero2 = scan.nextInt();
            System.out.print("Digite o número 3: ");
            int numero3 = scan.nextInt();
            System.out.print("Digite o número 4: ");
            int numero4 = scan.nextInt();
            System.out.print("Digite o número 5: ");
            int numero5 = scan.nextInt();
            break;
        }
    }
    public static void Exercicio15(Scanner scan) {
        int numero1 = 0;
        int numero2 = 1;
        System.out.print("Qual a quantidade de termos que quer?: ");
        int termo = scan.nextInt();

        System.out.println("O termo: 1 é o número: " + numero1);

        for (int i = 1; i < termo; i++) {
            System.out.println("O termo: " + (i+1) + " é o número: " + numero2);
            int proximo = numero1 + numero2;
            numero1 = numero2;
            numero2 = proximo;
        }
    }//estudar esse!
    public static void Exercicio38(Scanner scan){
        //fazer
    }//estudar for, vetor e lista, matrizes
}
