import java.util.ArrayList;
import java.util.Scanner;


public class Historico {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Filme> filmes;
    public ArrayList<Musica> musicas;

    public void HistoricoVisualizacao(){
        System.out.println("Últimas músicas adicionadas:");
        for(Musica i : musicas){
            System.out.println("Música nome:" +i._nome);
        }
        System.out.println("Últimos filmes adicionados:");
        for(Filme i : filmes){
            System.out.println("Filmes nome:" +i._nome);
        }
    }
    public void Estatistica(){
        System.out.println("Número de músicas adicionadas: "+ musicas.size());
        System.out.println("Número de filmes adicionados: "+ filmes.size());
    }

    public void PreferenciaFilme(){
        ArrayList<Filme> musicaPreferencia = new ArrayList<Filme>();
        System.out.println("Qual a sua preferência de filme?");
        String estilo = sc.next();
        for(Filme i : filmes){
            if(i._nome.equals(estilo)){
                musicaPreferencia.add(i);
            }
        }
    }

    public void PreferenciaMusica(){
        ArrayList<Musica> musicaPreferencia = new ArrayList<Musica>();
        System.out.println("Qual a sua preferência de música?");
        String estilo = sc.next();
        for(Musica i : musicas){
            if(i._nome.equals(estilo)){
                musicaPreferencia.add(i);
            }
        }
    }

    public void AvaliacaoFilme(){
        String avaliacaoFilme;
        System.out.println("Filmes:");
        for(Filme i : filmes){
            System.out.println("Filme nome:" +i._nome);
            System.out.println("Deixe sua avaliação:");
            avaliacaoFilme = sc.next();
        }
    }
    public void AvaliacaoMusica(){
        String avaliacaoMusica;
        System.out.println("Música:");
        for(Musica i : musicas){
            System.out.println("Música nome:" +i._nome);
            System.out.println("Deixe sua avaliação:");
            avaliacaoMusica = sc.next();
        }
    }


}
