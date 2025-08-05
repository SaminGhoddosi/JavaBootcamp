import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual é o raio do círculo: ");
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.print("A área é de: "+String.format("%.2f", area)+"m²");
        //como fazer o arredondado no próprio resultado. e por que a variável é String e não double no string.format
    }
}
