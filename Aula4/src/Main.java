import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuário: ");
        String usuario = sc.next();
        System.out.println("Senha: ");
        String senha = sc.next();
          while(!usuario.equals("admin") || !senha.equals("1234")){
            System.out.println("Senha ou usuário incorretos");
            System.out.println("Usuário: ");
            usuario = sc.next();
            System.out.println("Senha: ");
            senha = sc.next();
          }
          do{
              System.out.println("Senha ou usuário incorretos");
              System.out.println("Usuário: ");
              usuario = sc.next();
              System.out.println("Senha: ");
              senha = sc.next();
          }while(!usuario.equals("admin") || !senha.equals("1234"));

          while(true){// jeito mais fácil, mas não tão válido
              System.out.println("Usuário: ");
              usuario = sc.next();
              System.out.println("Senha: ");
              senha = sc.next();
              if(!usuario.equals("admin") || !senha.equals("1234")){
                  System.out.println("Informações incorretas, digite novamente");
              }else{
                  break;
              }
          }

    }
}//por que alguém começaria um projeto em java invés de c#