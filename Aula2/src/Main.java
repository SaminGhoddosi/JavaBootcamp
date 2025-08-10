import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
//        System.out.println(numero>0); // se for positivo, vai responder true, senão falso
//        if(numero> 0) {
//            System.out.println("Positivo");
//        }else if(numero ==0){
//            System.out.println("Negativo");
//        }else{
//            System.out.println("É negativo");
//        }
        System.out.println("O número é " + (numero > 0 ? "Positivo" : numero == 0 ? "Nulo" : "Negativo"));
        //ternário é só para dois números no máximo
        System.out.print("Qual turno você trabalha? M, V, N: ");
        String turno = scan.next();// scan.next().toUpperCase();, mas usar ignoreCase é melhor
        if (turno.equals("M") || turno.equals("m")) { // || &&
            System.out.println("Bom dia");
        } else if (turno.toUpperCase().equals("V")) {
            System.out.println("Boa tarde");
        } else if (turno.equalsIgnoreCase("N")) {// melhor jeito de analisar case
            System.out.println("Boa noite");
        } else {
            System.out.println("Entrada inválida");
        }
    }// || isso é uma pipeline
}