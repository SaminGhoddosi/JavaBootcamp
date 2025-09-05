public class Musica extends Conteudo {
    public String _cantor;
    public String _estilo;
    public Musica(String nome, String pais, String cantor, String estilo){
        super(nome, pais);
        this._cantor = cantor;
        this._estilo = estilo;
    }
}
