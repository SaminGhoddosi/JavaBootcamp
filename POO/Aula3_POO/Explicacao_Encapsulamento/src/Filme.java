import java.util.ArrayList;
import java.util.Random;

public class Filme {
    private int id;
    private String titulo;// public e private é o nível de acesso
    private String duracao;// usar para apenas a classe que criou poder mudar
    private String genero;
    private ArrayList<Double> notas;
// Ctrl+Insert
//    public Filme(){
//        this.id = new Random().nextInt(10000);
//    }
//    public void setTitulo(String titulo){
//        this.titulo = titulo;
//    }//muda o título
//    public String getTitulo() {
//        return this.titulo;
//    }//pega o título
//    public int getId(){
//        return this.id;
//    }// quando tem só get não tem como trocar fora dele. Eis uma regra de negócio.
//    public void addNota(double nota){
//        this.notas.add(nota);
//    }//notas seria uma ArrayList. Pode mudar, adicionar e retirar o código do get e set


    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
