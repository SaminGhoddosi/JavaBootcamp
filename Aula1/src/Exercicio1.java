import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.print("Em que ano você nasceu?");
        int year = scan.nextInt();
        int age = 2025 - year;
        System.out.println("Sua idade é de "+age);

    }
}
