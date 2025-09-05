import java.util.ArrayList;

public class Playlist {
    public String nome;
    public ArrayList<Musica> musicas;

    public Playlist(String nome, ArrayList<Musica> musicas){
        this.nome = nome;
        this.musicas = musicas;
    }

    public void MostrarPlaylist(){
        for(Musica i : musicas){
            System.out.println("Música nome:" +i._nome);
        }
    }
}


