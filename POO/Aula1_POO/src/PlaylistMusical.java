import java.util.ArrayList;

public class PlaylistMusical {
    public String nomePlaylist;
    private ArrayList<String> musicas;
    private int indiceAtual;

    public PlaylistMusical(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
        this.musicas = new ArrayList<>();
        this.indiceAtual = -1;
    }

    public void adicionarMusica(String musica) {
        musicas.add(musica);
    }

    public void tocarProxima() {
        if (musicas.isEmpty()) {
            System.out.println("A playlist está vazia.");
        }
       else{
            if (indiceAtual < musicas.size() - 1) {
                indiceAtual++;
                mostrarMusicaAtual();
            } else {
                System.out.println("Você chegou ao fim da playlist.");
            }
        }
    }

    public void mostrarMusicaAtual() {
        if (indiceAtual >= 0 && indiceAtual < musicas.size()) {
            System.out.println("Agora está tocando: " + musicas.get(indiceAtual));
        } else {
            System.out.println("Nenhuma música tocando ainda.");
        }
    }
}
