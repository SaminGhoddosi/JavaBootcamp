public class Filme extends Conteudo {
    public double _duracao;
    public String _estilo;
    public Filme(String nome, String pais, double duracao, String estilo){
        super(nome, pais);
        this._duracao = duracao;
        this._estilo = estilo;
    }
}
