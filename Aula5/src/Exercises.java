import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Parte 1 — Arrays
        //Array simples
        //
        //Crie um array de 5 números inteiros.
        //

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        for(int i = 0; i<numeros.length;i++){
            System.out.println("Número "+(i+1)+" é: "+numeros[i]);
        }

        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
        int valor = 0;
        for(int i = 0; i< numeros2.length;i++){
            valor += numeros2[i];
        }
        System.out.println("O valor é de: "+valor);
        int[] numeros3 = {1,2,3,4,5,6,7,8,9,10};
        int menor = numeros3[0];
        int maior = numeros3[0];
        for(int i = 0; i<numeros3.length;i++){
            if(menor>numeros3[i]){
                menor = numeros3[i];
            }
            if(maior<numeros3[i]){
                maior = numeros3[i];
            }
        }
        System.out.println("O maior valor é de "+maior);
        System.out.println("O menor valor é de "+menor);
        int[] numeros4 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int par = 0;
        int impar = 0;
        for(int i =0; i<numeros4.length;i++){
            if(numeros4[i]%2 == 0 ){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("O número de pares é de "+par+" e o número de ímpares é de "+impar);
        String[] nomes = {"samin", "thiago", "matheus", "karin", "raquel"};
        for(int i = 0; i<nomes.length; i++){
            //imprima os nomes na ordem inversa.
        }










        //Parte 2 — ArrayList
        //Lista de nomes
        //
        List<String> nomes2 = new ArrayList<String>();
        nomes2.add("Samin");
        nomes2.add("Thiago");
        nomes2.add("Matheus");
        nomes2.add("Karin");
        nomes2.add("Raquel");
        for(int i=0; i<nomes2.size(); i++){
            System.out.println(nomes2.get(i));
        }
        System.out.print("Digite um nome: ");
        String nome = scan.next();
        if(nomes2.contains(nome)){
            System.out.println("Está aqui");
        }else{
            System.out.println("Não está");
        }
        List<Integer> numeros5 = new ArrayList<>();
        for(int i = 0; i< numeros5.size();i++){
            numeros5.add(i);
        }
        numeros5.removeIf(numero-> numero%2 == 0);
        for(Integer numero: numeros5){
            System.out.println(numero);
        }
        //Ordenar lista
        //
        //Crie um ArrayList<String> com 6 frutas.
        //
        //Ordene em ordem alfabética (Collections.sort).
        //
        //Imprima usando foreach.
        //
        //Notas e média
        //
        //Crie um ArrayList<Double> para armazenar 5 notas.
        //
        //Calcule e imprima a média.
        //
        //Parte 3 — For e Foreach
        //For vs Foreach
        //
        //Crie um array de 5 inteiros.
        //
        //Imprima usando for (com índice) e depois foreach.
        //
        //Filtrar números maiores que X
        //
        //Crie um ArrayList<Integer> com 10 números aleatórios.
        //
        //Use foreach para imprimir apenas os maiores que 5.
        //
        //Concatenar strings
        //
        //Crie um array de palavras.
        //
        //Use foreach para juntar todas em uma frase.
        //
        //Tabela de multiplicação
        //
        //Peça para o usuário um número.
        //
        //Use for para mostrar a tabuada dele.
        //
        //Duplicar valores
        //
        //Crie um ArrayList<Integer> com 5 números.
        //
        //Use for para dobrar cada valor e salvar no mesmo índice.

    }
}
