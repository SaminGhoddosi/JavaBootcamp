import java.util.ArrayList;

public class Assinatura {
    ArrayList<UsuarioPremium> usuarioPremiums;
    ArrayList<UsuarioGratuito> usuarioGratuitos;

    public void UsuarioPremium(){
        System.out.println("Lista de usuários premiums:");
        for(UsuarioPremium i : usuarioPremiums){
            System.out.println("Nome: " +i._nome);
        }
    }

    public void UsuarioGratuitos(){
        System.out.println("Lista de usuários gratuitos:");
        for(UsuarioGratuito i : usuarioGratuitos){
            System.out.println("Nome: " +i._nome);
        }
    }

    public void AssinaturaEstilo(){
        System.out.println("Número de clientes com conta anual");
        ArrayList<UsuarioPremium> usarioAssinaturaAnual = new ArrayList<UsuarioPremium>();
        ArrayList<UsuarioPremium> usarioAssinaturaMensal = new ArrayList<UsuarioPremium>();
        for(UsuarioPremium i : usuarioPremiums){
            if(i.tipo.equals(Tipo.Anual)){
                usarioAssinaturaAnual.add(i);
            }else{
                usarioAssinaturaMensal.add(i);
            }
        }
    }

}
