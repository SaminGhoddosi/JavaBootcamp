public class DiarioSecreto {
    public String dono;
    public String senha;
    public String texto;
    public DiarioSecreto(String dono,String senha,String texto){
        this.dono = dono;
        this.senha = senha;
        this.texto = texto;
    }
    public void ler(String senha){
        if(senha.equals(this.senha)){
            System.out.println("Usuário: "+ this.dono);
            System.out.println("Senha: "+ this.senha);
            System.out.println("Texto: "+ this.texto);
        }
        else{
            System.out.println("Acesso negado!");
        }
    }

}
