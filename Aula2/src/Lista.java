import java.util.Scanner;
public class Lista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 100;
        do {
             lista();
             int escolhaLista = scan.nextInt();
             switch (escolhaLista) {
                 case 1:
                         opcao =  Lista1(scan, opcao);
                         break;
                     case 2:
                         opcao = Lista2(scan,opcao);
                         break;

                 }
        }while(opcao != 0);
        System.out.println("Tchau");


    }
    public static int Lista1 (Scanner scan, int opcao){
        opcaolista1();
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
            case 12:
                exercicio12(scan);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        Clear(scan, opcao);
        return opcao;
    }
    public static int Lista2(Scanner scan, int opcao){
        opcaolista2();
        int escolha2 = scan.nextInt();

        switch (escolha2) {
            case 0:
                opcao = 0;
                break;
            case 4:
                ExercicioExtra04(scan);
                break;
            case 11:
                exercicioExtra11(scan);
                break;
            case 12:
                exercicioExtra12(scan);
                break;
            case 13:
                exercicioExtra13(scan);
                break;
            case 14:
                exercicioExtra14(scan);
                break;
            case 16:
                exercicioExtra16(scan);
                break;
            case 27:
                exercicioExtra27(scan);
                break;
            case 28:
                exercicioExtra28(scan);
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
        System.out.print("Quer a lista 1 ou 2?: ");
    }
    public  static void opcaolista1(){
        System.out.print("Escolha o exercício entre 1 e 11. Digite 0 para sair do programa: ");
    }
    public static void opcaolista2(){
        System.out.print("Escolha o exercício 4, 11 até 14, 16, 27 ou 28. Digite 0 para sair do programa: ");
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
        System.out.println(scan.nextInt()%2==0?"Par":"ìmpar");
    }
    public static void exercicio3(Scanner scan){
        System.out.println("Classifique a idade do usuário como jovem (menos de 30 anos) ou não jovem (65) anos ou mais.");
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
        int numero1 = scan.nextInt();
        System.out.print("Digite o número2: ");
        int numero2  = scan.nextInt();
        System.out.print("Digite o número3: ");
        int numero3 = scan.nextInt();
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
    public static void exercicio12(Scanner scan){
        System.out.print("Digite a sua primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;
        char conceito;
        if(media>=9 && media<=10){
            conceito = 'A';
        }else if(media>=7.5 && media<9){
            conceito = 'B';
        }else if(media>=6 && media<7.5){
            conceito = 'C';
        }else if(media>=4 && media<6){
            conceito = 'D';
        }else{
            conceito = 'E';
        }
        System.out.println("A nota1: "+String.format("%.1f", nota1)+ " e nota2: "+String.format("%.1f", nota2)+ " forma a média de: "+String.format("%.1f", media)+ ". O conceito foi de: "+conceito);
        String situacao;
        switch(conceito){
            case 'A','B','C':
                situacao = "Aprovado";
                break;
            case 'D', 'E':
                situacao = "Reprovado";
                break;
            default:
                situacao = "Situação inesperada";
                break;
        }
        System.out.print(situacao);
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
        }else if(salarioColaborador>280 && salarioColaborador<=700){
            percentual = 15;

        }else if(salarioColaborador>700 && salarioColaborador<=1500){
            percentual = 10;
        }else{
            percentual = 5;
        }
        aumento =  aumento(salarioColaborador, percentual);
        salarioColaboradorAumento = salarioColaboradorAumento(salarioColaborador, aumento);
        System.out.println("O salário do "+nomeColaborador+ " antes era de "+ String.format("%.2f", salarioColaborador)+" com o aumento de "+percentual+ "% ("+ String.format("%.2f", aumento)+"), fica o valor de R$"+String.format("%.2f", salarioColaboradorAumento));
    }
    public static double aumento(double salarioColaborador, int percentual){
        return salarioColaborador*(percentual/100.0);//colocar .0 para entender que é double
    }//só praticando função
    public static double salarioColaboradorAumento(double salarioColaborador, double aumento){
        return salarioColaborador + aumento;
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
            descontoINSS = descontoINSS(salarioBruto, porcentagemINSS);
            descontoFTGS = descontoFGTS(salarioBruto, porcentagemFGTS);
        }
        else if(salarioBruto>900&&salarioBruto<=1500){
            porcentagemIR = 5;
            descontoIR = descontoIR(salarioBruto, porcentagemIR);
            descontoINSS = descontoINSS(salarioBruto, porcentagemINSS);
            descontoFTGS = descontoFGTS(salarioBruto, porcentagemFGTS);
        }else{
            porcentagemIR = 10;
            descontoIR = descontoIR(salarioBruto, porcentagemIR);
            descontoINSS = descontoINSS(salarioBruto, porcentagemINSS);
            descontoFTGS = descontoFGTS(salarioBruto, porcentagemFGTS);
        }
        double totalDescontos = descontoIR+descontoFTGS+descontoINSS;
        double salarioLiquido = salarioBruto - totalDescontos;
        System.out.println("Salário Bruto: ("+valorHora+" * "+horaTrabalhada+")   :R$ "+String.format("%.2f", salarioBruto));
        System.out.println("(-) IR("+porcentagemIR+"%)   :R$ "+String.format("%.2f", descontoIR));
        System.out.println("(-) INSS("+porcentagemINSS+"%)   :R$ "+String.format("%.2f", descontoINSS));
        System.out.println("(-) FGTS("+porcentagemFGTS+"%)   :R$ "+String.format("%.2f", descontoFTGS));
        System.out.println("Total de descontos   :R$ "+String.format("%.2f", totalDescontos));
        System.out.println("Salário líquido : R$ "+ String.format("%.2f", salarioLiquido));
    }
    public static double descontoIR(double salarioBruto, int porcentagemIR){
        return salarioBruto*(porcentagemIR/100.0);
    }
    public static double descontoINSS(double salarioBruto, int porcentagemINSS){
        return salarioBruto*(porcentagemINSS/100.0);
    }
    public static double descontoFGTS(double salarioBruto, int porcentagemFGTS){
        return salarioBruto*(porcentagemFGTS/100.0);
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
            System.out.println("O delta é negativo("+delta+"), cálculo impossível");
        }else if(delta == 0){
            System.out.println("Delta é "+delta+", logo só um X: "+String.format("%.4f",x1));
        }else {
            System.out.println("Delta é positivo("+delta+"), logo tem dois Xs. X1: "+String.format("%.4f",x1)+". X2: "+String.format("%.4f",x2));
        }
    }
    public static void exercicioExtra13(Scanner scan){
        System.out.print("Digite o número: ");
        int dia = scan.nextInt();
        String diaSemana;
        switch (dia){
            case 1:
                diaSemana = "1 - Domingo";
                break;
            case 2:
                diaSemana = "2 - Segunda";
                break;
            case 3:
                diaSemana = "3 - Terça";
                break;
            case 4:
                diaSemana = "4 - Quinta";
                break;
            case 5:
                diaSemana = "5 - Sexta";
                break;
            case 6:
                diaSemana = "6 - Sábado";
                break;
            case 7:
                diaSemana = "7 - Domingo";
                break;
            default:
                diaSemana = "Número inválido!";
                break;
        }
        System.out.println(diaSemana);
    }
    public static void exercicioExtra14(Scanner scan){
        System.out.print("Digite a sua primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a sua segunda nota: ");
        double nota2 = scan.nextDouble();
        double media = (nota1+nota2)/2;
        char conceito;
        if(media>=9 && media<=10){
            conceito = 'A';
        }else if(media>=7.5 && media<9){
            conceito = 'B';
        }else if(media>=6 && media<7.5){
            conceito = 'C';
        }else if(media>=4 && media<6){
            conceito = 'D';
        }else{
            conceito = 'E';
        }
        System.out.println("A nota1: "+String.format("%.1f", nota1)+ " e nota2: "+String.format("%.1f", nota2)+ " forma a média de: "+String.format("%.1f", media)+ ". O conceito foi de: "+conceito);
        String situacao;
        switch(conceito){
            case 'A','B','C':
                situacao = "Aprovado";
                break;
            case 'D', 'E':
                situacao = "Reprovado";
                break;
            default:
                situacao = "Situação inesperada";
                break;
        }
        System.out.print(situacao);
    }
 public static void ExercicioExtra04(Scanner scan){
        System.out.print("Digite a letra: ");
        String letra = scan.next().toLowerCase();
        if(letra.length() > 1){
            System.out.println("Digite somente um character");
            System.exit(0);
        }
        switch (letra){
            case "a","e","i","o","u" -> System.out.println("É uma vogal!");
            default -> System.out.println("Não é uma vogal!"); //another way to use
        }
        if(letra.equals("a")|| letra.equals("e")|| letra.equals("i")|| letra.equals("o")||letra.equals("u")){
            System.out.println("É uma vogal!");
        }else{
            System.out.println("Não é uma vogal!");
        }//best way->
        if("aeiou".contains(letra)){
            System.out.println("É vogal!");
        }else if("0123456789".contains(letra)){
            System.out.println("Número!");
        }else{
            System.out.println("Consoante");
        }
 }
 public static void exercicioExtra27(Scanner scan){
        System.out.print("Quantidade, em Kg, de morangos que você quer comprar: ");
        double quantidadeMorango = scan.nextDouble();
        System.out.print("Quantidade, em Kg, de maças que você quer comprar: ");
        double quantidadeMaca = scan.nextDouble();
        double quantidadeTotal = quantidadeMaca+quantidadeMorango;
        double precoMorango, precoMaca;
        if(quantidadeMorango < 5){
            precoMorango = quantidadeMorango * 2.5;
        }else {
            precoMorango = quantidadeMorango * 2.2;
        }
        if(quantidadeMaca < 5){
          precoMaca = quantidadeMaca * 1.8;
        }else {
            precoMaca = quantidadeMaca * 1.5;
        }// poderia ter usado o ternário
        double valorTotal = precoMorango + precoMaca;
        if (quantidadeTotal>8){
            valorTotal = valorTotal -(valorTotal*0.1);
        }
     System.out.println("A quantidade de maças compradas foi de: "+quantidadeMaca+"kg. O valor ficou de R$"+precoMaca);
     System.out.println("A quantidade de morangos comprados foi de: "+quantidadeMorango+"kg. O valor ficou de R$"+precoMorango);
     System.out.println(quantidadeTotal>8 ? "A quantidade total comprada foi de "+quantidadeTotal+"kg. Com o desconto de 10% o valor total ficou de R$"+valorTotal : "A quantidade total comprada foi de "+quantidadeTotal+"kg.O valor total ficou de R$"+valorTotal);
 }
 public static void exercicioExtra28(Scanner scan){
        System.out.print("Você tem o cartão tabajara?: S-Sim N-Não ");
        String cartaoTabajara = scan.next().toLowerCase();
        System.out.println("Qual tipo de carne gostaria?:\n" +
                "1 - File duplo\n" +
                "2 - Alcatra");
        String tipoCarne = scan.next();
     System.out.print("Quantos kg da carne você gostaria?: ");
     double quantidadeCarne = scan.nextDouble();
     double precoTotal;
        switch (tipoCarne){
            case "1":
                tipoCarne = "File duplo";
                precoTotal= (quantidadeCarne<5) ? quantidadeCarne*4.9 : quantidadeCarne*5.8;
                break;
            case "2":
                tipoCarne = "Alcatra";
                precoTotal= (quantidadeCarne<5) ? quantidadeCarne*5.9 : quantidadeCarne*6.8;
                break;
            default:
                System.out.println("Erro!");
                precoTotal = 0;
                break;
        }
        System.out.println("---Nota fiscal---");
        int desconto;
        double valorPagar;
        if(cartaoTabajara.equals("s")){
            desconto=5;
            valorPagar = precoTotal-(precoTotal*(desconto/100.0));
        }else{
            desconto=0;
            valorPagar = precoTotal;
        }
     System.out.println("Carne: "+tipoCarne+
             "\nQuantidade: "+quantidadeCarne+
             "\nPreço Total:"+String.format("%.2f", precoTotal)+
             "\nDesconto cartão tabajara: "+ desconto+"%"+
             "\nValor a pagar: R$"+String.format("%.2f", valorPagar));
    }








}