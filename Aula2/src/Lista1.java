import java.util.Scanner;
public class Lista1 {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 100;
        do {
             lista();
             int escolhaLista = scan.nextInt();
             switch (escolhaLista) {
                 case 1:
                         opcao =  Vida1(scan, opcao);
                         break;
                     case 2:
                         opcao = Vida2(scan,opcao);
                         break;
                 }
        }while(opcao != 0);
        System.out.println("Tchau");

    }
    public static int Vida1 (Scanner scan, int opcao){
        lista1();
        int escolha = scan.nextInt();
        switch (escolha) {
            case 0:
                opcao = 0;
                break;
            case 1:
                exercicio1(scan);
                break;
            case 2:
                exercicio2(scan);
                break;
            case 3:
                exercicio3(scan);
                break;
            case 4:
                exercicio4(scan);
                break;
            case 5:
                exercicio5(scan);
                break;
            case 6:
                exercicio6(scan);
                break;
            case 7:
                exercicio7(scan);
                break;
            case 8:
                exercicio8(scan);
                break;
            case 9:
                exercicio9(scan);
                break;
            case 10:
                exercicio10(scan);
                break;
            case 11:
                exercicio11(scan);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        Clear(scan, opcao);
        return opcao;
    }
    public static int Vida2(Scanner scan, int opcao){
        lista2();
        int escolha2 = scan.nextInt();

        switch (escolha2) {
            case 0:
                opcao = 0;
                break;

            case 11:
                exercicioExtra11(scan);
                break;
            case 12:
                exercicioExtra12(scan);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        Clear(scan, opcao);
        return opcao;
    }
    public static void Clear(Scanner scan, int opcao){
        if(opcao != 0){
            System.out.println("--Digite qualquer coisa na tela para continuar--");
            scan.next();
            for (int i =0; i<=20; i++){
                System.out.println();
            }
        }
    }
    public static void lista(){
        System.out.print("Quer a lista 1(Principal) ou 2(Extra)?: ");
    }
    public  static void lista1(){
        System.out.print("Escolha o exercício entre 1 e 11. Digite 0 para sair do programa: ");
    }
    public static void lista2(){
        System.out.print("Escolha o exercício 11 ou 12. Digite 0 para sair do programa: ");
    }
    public static void exercicio1(Scanner scan){
        System.out.println("Verifique se um número é positivo, negativo ou zero.");
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();
        System.out.println(numero>1?"positivo":(numero ==0)?"nulo":"negativo");

    }
    public static void exercicio2(Scanner scan){
        System.out.println("Determine se um número é par ou ímpar");
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();
        System.out.println(numero%2==0?"Par":"Impar");
    }
    public static void exercicio3(Scanner scan){
        System.out.println("Classifique a idade do usuario como jovem (menos de 30 anos) ou não jovem (65) anos ou mais.");
        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println(idade<30?"Jovem":idade>=60?"Não jovem":"Meio-termo");
    }
    public static void exercicio4(Scanner scan){
        System.out.println("Verifique se um número é divisível por 3 e 5.");
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();
        if(numero % 3 == 0 && numero % 5 == 0){
            System.out.println("O número "+ numero+ " é divisível por 3 e 5.");
        }else{
            System.out.println("O número "+ numero+ " não divisível por 3 e 5.");
        }
    }
    public static void exercicio5(Scanner scan){
        System.out.println("Decida se um aluno foi aprovado (nota maior ou igual a 60) ou reprovado");
        System.out.print("Digite a sua nota: ");
        double nota = scan.nextDouble();
        System.out.println(nota>=60?"Aprovado!": "Reprovado");
    }
    public static void exercicio6(Scanner scan){
        System.out.println("Esse exercício não existe!");
        System.out.println("(╯▔皿▔)╯");
    }
    public static void exercicio7(Scanner scan){
        System.out.println("Determine se um ano é bissexto ou não.");
        System.out.print("Digite o ano: ");
        int ano = scan.nextInt();
        System.out.println(ano%4==0 && (ano%100!=0 || ano%400 ==0)?"É bissexto":"Não é bissexto");
    }
    public static void exercicio8(Scanner scan){
        System.out.println("Classifique três números em ordem crescente");
        System.out.print("Digite o número1: ");
        double numero1 = scan.nextDouble();
        System.out.print("Digite o número2: ");
        double numero2 = scan.nextDouble();
        System.out.print("Digite o número3: ");
        double numero3 = scan.nextDouble();
        if(numero1>numero2 && numero1>numero3){
            if(numero2>numero3){
                System.out.println("1- "+numero1+" 2- "+numero2+ " 3- "+numero3);
            }else{
                System.out.println("1- "+numero1+" 2- "+numero3+ " 3- "+numero2);
            }
        }
        else if(numero2>numero1 && numero2 >numero3){
            if(numero1>numero3){
                System.out.println("1- "+numero2+" 2- "+numero1+ " 3- "+numero3);
            }
            else{
                System.out.println("1- "+numero2+" 2- "+numero3+ " 3- "+numero1);
            }
        }
        else{
            if(numero1>numero2){
                System.out.println("1- "+numero3+" 2- "+numero1+ " 3- "+numero2);
            }else{
                System.out.println("1- "+numero3+" 2- "+numero2+ " 3- "+numero1);
            }
        }
    }
    public static void exercicio9(Scanner scan){
        System.out.println("Verifique se um número está dentro de um intervalo especificado pelo usuário");
        System.out.print("Digite o início do intervalo: ");
        int inicioIntervalo = scan.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        int fimIntervalo = scan.nextInt();
        System.out.print("Digite o número: ");
        int numero = scan.nextInt();
        System.out.println((numero>=inicioIntervalo && numero<=fimIntervalo)?"Está dentro":"Está fora");
    }
    public static void exercicio10(Scanner scan){
        System.out.println("Determine se um triângulo é equilátero, isósceles ou escaleno.");
        System.out.print("Digite a medida do lado 1: ");
        double medida1 = scan.nextDouble();
        System.out.print("Digite a medida do lado 2: ");
        double medida2 = scan.nextDouble();
        System.out.print("Digite a medida do lado 3: ");
        double medida3 = scan.nextDouble();
        if(medida1 == medida2 && medida1== medida3 && medida2==medida3){
            System.out.println("É um triângulo Equilátero");
        }else if(medida1 != medida2 && medida1!= medida3 && medida2!=medida3){
            System.out.println("É um triângulo Escaleno");
        }else{
            System.out.println("É um triângulo Isósceles");
        }
    }
    public static void exercicio11(Scanner scan){
        System.out.println("Decida se uma pessoa pode se aposentar (idade igual ou superior a 65 anos) ou não.");
        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println(idade>=65?"Pode se aposentar":"Não pode se aposentar");
    }

    public static void exercicioExtra11(Scanner scan){
        System.out.print("Digite o nome do colaborador: ");
        String nomeColaborador = scan.next();
        System.out.print("Digite o seu salário: ");
        double salarioColaborador = scan.nextDouble();
        double aumento;
        double salarioColaboradorAumento;
        int percentual;
        if(salarioColaborador>=280){
            percentual = 20;
            aumento =  (salarioColaborador*(percentual/100.0));//colocar .0 para entender que é double
            salarioColaboradorAumento = salarioColaborador + aumento;

        }else if(salarioColaborador>280 && salarioColaborador<=700){
            percentual = 15;
            aumento =  (salarioColaborador*(percentual/100.0));
            salarioColaboradorAumento = salarioColaborador + aumento;

        }else if(salarioColaborador>700 && salarioColaborador<=1500){
            percentual = 10;
            aumento =  (salarioColaborador*(percentual/100.0));
            salarioColaboradorAumento = salarioColaborador + aumento;
        }else{
            percentual = 5;
            aumento =  (salarioColaborador*(percentual/100.0));
            salarioColaboradorAumento = salarioColaborador + aumento;
        }
        System.out.println("O salário do "+nomeColaborador+ " antes era de "+ String.format("%.2f", salarioColaborador)+" com o aumento de "+percentual+ "% ("+ String.format("%.2f", aumento)+"), fica o valor de R$"+String.format("%.2f", salarioColaboradorAumento));
    }
    public static void exercicioExtra12(Scanner scan){
        System.out.print("Digite o valor da sua hora: ");
        double valorHora = scan.nextDouble();
        System.out.print("Digite quantas horas trabalhou nesse mês?: ");
        int horaTrabalhada = scan.nextInt();
        double salarioBruto = valorHora*horaTrabalhada;
        int porcentagemIR;
        int porcentagemINSS=10;
        int porcentagemFGTS=11;
        double descontoIR;
        double descontoINSS;
        double descontoFTGS;
        if(salarioBruto<=900){
            porcentagemIR = 0;
            descontoIR = 0;
            descontoINSS = salarioBruto*(porcentagemINSS/100);
            descontoFTGS = salarioBruto*(porcentagemFGTS/100);
        }
        else if(salarioBruto>900&&salarioBruto<=1500){
            porcentagemIR = 5;
            descontoIR = salarioBruto*(porcentagemIR/100);
            descontoINSS = salarioBruto*(porcentagemINSS/100);
            descontoFTGS = salarioBruto*(porcentagemFGTS/100);
        }else{
            porcentagemIR = 10;
            descontoIR = salarioBruto*(porcentagemIR/100);
            descontoINSS = salarioBruto*(porcentagemINSS/100);
            descontoFTGS = salarioBruto*(porcentagemFGTS/100);
        }
        double totalDescontos = descontoIR+descontoFTGS+descontoINSS;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salário Bruto: ("+valorHora+" * "+horaTrabalhada+"   :R$ "+String.format("%.2f", salarioBruto));
        System.out.println("(-) IR("+porcentagemIR+"%)   :R$ "+String.format("%.2f", descontoIR));
        System.out.println("(-) INSS("+porcentagemINSS+"%)   :R$ "+String.format("%.2f", descontoINSS));
        System.out.println("(-) IR("+porcentagemFGTS+"%)   :R$ "+String.format("%.2f", descontoFTGS));
        System.out.println("Total de descontos   :R$ "+String.format("%.2f", totalDescontos));
        System.out.println("Salário líquido : R$ "+ String.format("%.2f", salarioLiquido));
    }
    public static void exercicioExtra16(Scanner scan){
        System.out.print("Digite o A: ");
        int A = scan.nextInt();
        if(A == 0){
            System.out.println("A é zero, o que torna impossível o cálculo!");
        }
        System.out.print("Digite o B: ");
        int B = scan.nextInt();
        System.out.print("Digite o C: ");
        int C = scan.nextInt();
        double delta = Math.pow(B, 2)*4+A+C;
        double x1 = (-B +Math.sqrt(delta))/(2*A);
        double x2 = (-B -Math.sqrt(delta))/(2*A);
        if(delta < 0){
            System.out.println("O delta é negativo, cálculo impossível");
        }else if(delta == 0){
            System.out.println("Delta é 0, logo só um X: "+x1);
        }else {
            System.out.println("Delta é positivo, logo tem dois Xs. X1: "+x1+". X2: "+x2);
        }

    }





}


