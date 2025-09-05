public class UsuarioPremium extends Usuario {
    public Tipo tipo;
    public UsuarioPremium(String nome, String email, Tipo tipo){
        super(nome, email);
        this.tipo = tipo;
    }
}
