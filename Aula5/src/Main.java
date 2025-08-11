import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);

          int[] idades = new int[3];//sempre precisa colocar tamanho no array
          idades[0] = oi.nextInt();
          idades[1] = 20;
          idades[2] = 20;
        System.out.println("idade 1: "+idades[0]);
        System.out.println("idade 1: "+idades[1]);
        System.out.println("idade 1: "+idades[2]);
        System.out.println(idades.length);
        for(int i =0; i< idades.length;i++){
            System.out.print("\nA idade "+(i+1)+" é de: "+idades[i]);
        }
        int[] produtos = new int[3];
        System.out.print("Digita algo: ");
        int asdf = oi.nextInt();
        int[] numeros = {asdf, 78,3,4};
        for(int i : numeros){
            System.out.println(i);
        }
        String[] bomDia = {"oi", "tchau", "boa tarde"};
        for(String asda : bomDia){
            System.out.println(asda);
        }
        System.out.println("Digite o número");
        long numero = oi.nextInt();
        for(long i = numero; i>=0;i--){
            System.out.println(i);
        }
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Sami");
        nomes.add("Oi");
        nomes.add("Tchau");
        nomes.add("Sa");
        nomes.add("Saas");
        int ultimonome = nomes.size()-1;
        System.out.println(nomes.get(ultimonome));
        nomes.remove(ultimonome);
        for(int i = 0; i<nomes.size();i++){
            System.out.println(nomes.get(i));
        }
        for(String nome : nomes){
            System.out.println(nome);
        }
        nomes.clear();
        ArrayList<Integer> numeros2 = new ArrayList<Integer>();
    }
}
