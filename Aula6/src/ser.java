import java.util.ArrayList;
import java.util.Scanner;

//public class ControleDeMonstros {
//
//    static ArrayList<String> nomeMonstro = new ArrayList<>();
//    static ArrayList<Integer> tipoMonstro = new ArrayList<>();
//    static ArrayList<Integer> fraqueza = new ArrayList<>();
//    static String[] tipo = {"Fogo", "Água", "Planta", "Luta", "Ar"};
//    static Scanner scan = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        while (true) {
//            System.out.println("\n===MENU===");
//            System.out.println("(1) - Novo Monstro");
//            System.out.println("(2) - Lista de Monstro");
//            System.out.println("(3) - Ver Monstro Específico");
//            System.out.println("(4) - Remover Monstro");
//            System.out.println("(0) - Sair");
//            System.out.println("Opção: ");
//            int menu = scan.nextInt();
//
//            if (menu == 0) break;
//
//            switch (menu) {
//                case 1 -> cadastrarNovoMonstro();
//                case 2 -> listaDeMonstros();
//                case 3 -> mostrarMonstroEspecifico();
//                case 4 -> removerMonstro();
//                default -> System.out.println("Entrada Inválida");
//            }
//        }
//    }
//
//    public static void cadastrarNovoMonstro() {
//        System.out.println("Nome do monstro: ");
//        nomeMonstro.add(scan.next());
//
//
//        System.out.println("\nTipo de monstro: ");
//        mostrarTipos();
//        tipoMonstro.add(scan.nextInt());
//
//
//        System.out.println("\nFraqueza do monstro: ");
//        mostrarTipos();
//        fraqueza.add(scan.nextInt());
//    }
//
//    public static void listaDeMonstros() {
//        System.out.println("\n===LISTA DE MONSTROS===");
//        for (int i = 0; i < nomeMonstro.size(); i++) {
//            System.out.println("("+i+") - Nome: " + nomeMonstro.get(i) + ", Tipo: " + tipo[tipoMonstro.get(i)] + ", Fraqueza: " + tipo[fraqueza.get(i)]);
//        }
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            Thread.currentThread().interrupt();
//            return;
//        }
//    }
//
//    public static void mostrarMonstroEspecifico() {
//        System.out.println("Qual monstro você gostaria de ver as informações(0-" + (nomeMonstro.size()-1)+"): ");
//        int indice = scan.nextInt();
//        System.out.println("Nome: " + nomeMonstro.get(indice) + " Tipo: " + tipo[tipoMonstro.get(indice)] + " Fraqueza: " + tipo[fraqueza.get(indice)]);
//    }
//
//    public static void mostrarTipos() {
//        System.out.println("\n===OPÇÕES===");
//        for (int i = 0; i < tipo.length; i++) {
//            System.out.println("(" + i + ") " + tipo[i]);
//        }
//    }
//
//    public static void removerMonstro() {
//        System.out.println("Qual monstro você gostaria de remover: ");
//        listaDeMonstros();
//        int indice = scan.nextInt();
//        nomeMonstro.remove(indice);
//        tipoMonstro.remove(indice);
//        fraqueza.remove(indice);
//        System.out.println("Nome: " + nomeMonstro.get(indice));
//    }
//}
