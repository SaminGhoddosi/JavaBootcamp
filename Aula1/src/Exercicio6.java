import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1,x2;
        System.out.print("Digite o a: ");
        double a = scan.nextDouble();
        System.out.print("Digite o b: ");
        double b = scan.nextDouble();
        System.out.print("Digite o c: ");
        double c = scan.nextDouble();
        double delta = Math.pow(b, 2) -4*a*c;
        if(delta>=0){
            x1 = (-b +Math.sqrt(delta))/(2*a);
            x2 = (-b -Math.sqrt(delta))/(2*a);
             System.out.println("O valor de x1 é de: "+String.format("%.2f", x1)+". O valor de x2 é de:"+String.format("%.2f", x2));
        }else{
            System.out.println("Delta negativo");
        }
    }
 //delta = b² -4*a*c
    // x = -b +raiz delta/2*a
}
