import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual é o nome popular do animal?: ");
        String popularName = scan.next();
        System.out.print("Qual é o nome científico do "+ popularName+ "?: ");
        String scientificName = scan.next();
        System.out.print("Qual é a família biológica do "+ popularName+ "?: ");
        String biologicFamily = scan.next();
        System.out.print("Qual é o reino do "+ popularName+ "?: ");
        String kindgom = scan.next();
        System.out.print("Qual é a filo do " + popularName+ "?: ");
        String filo = scan.next();
        System.out.print("Qual é a classe do " + popularName+ "?: ");
        String classe = scan.next();
        System.out.print("Qual é a ordem do " + popularName+ "?: ");
        String ordem = scan.next();
        System.out.print("Qual é o gênero do " + popularName+ "?: ");
        String gender = scan.next();
        System.out.println("Segue as informações: Nome popular: "+ popularName+ " Nome científico: "+ scientificName+" Família biológica: "+ biologicFamily +" Reino: "+ kindgom+" Filo: " + filo +" Classe: "+ classe +" Ordem: "+ ordem +" Gênero:"+ gender );
    }
}
