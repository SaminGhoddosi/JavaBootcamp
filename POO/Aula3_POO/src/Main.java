import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        UsuarioPremium up1 = new UsuarioPremium("Samin", "samin@", Tipo.Anual);
        UsuarioPremium up2 = new UsuarioPremium("Ana", "ana@", Tipo.Anual);
        UsuarioPremium up3 = new UsuarioPremium("Lucas", "lucas@", Tipo.Mensal);
        UsuarioPremium up4 = new UsuarioPremium("Maria", "maria@", Tipo.Mensal);
        UsuarioPremium up5 = new UsuarioPremium("João", "joao@", Tipo.Mensal);
        UsuarioPremium up6 = new UsuarioPremium("Clara", "clara@", Tipo.Anual);


        Musica m1 = new Musica("Oi", "Brasil", "Thiago", "Sertanejo");
        Musica m2 = new Musica("Amor", "Brasil", "Thiago", "Sertanejo");
        Musica m3 = new Musica("Festa", "Brasil", "Thiago", "Sertanejo");
        Musica m4 = new Musica("RockIn", "Brasil", "Thiago", "Rock");
        Musica m5 = new Musica("PopHit", "Brasil", "Thiago", "Pop");

        ArrayList<Musica> musicas = new ArrayList<>();
        musicas.add(m1);
        musicas.add(m2);
        musicas.add(m3);
        musicas.add(m4);
        musicas.add(m5);


        Filme f1 = new Filme("Filme1", "Brasil", 101, "Romance");
        Filme f2 = new Filme("Filme2", "Brasil", 120, "Ação");
        Filme f3 = new Filme("Filme3", "Brasil", 90, "Romance");
        Filme f4 = new Filme("Filme4", "Brasil", 110, "Terror");
        Filme f5 = new Filme("Filme5", "Brasil", 95, "Suspense");

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(f1);
        filmes.add(f2);
        filmes.add(f3);
        filmes.add(f4);
        filmes.add(f5);


        Playlist playlist = new Playlist("Favoritas", musicas);
        playlist.MostrarPlaylist();


        Historico historico = new Historico();
        historico.musicas = musicas;
        historico.filmes = filmes;

        historico.HistoricoVisualizacao();
        historico.Estatistica();

        Assinatura assinatura = new Assinatura();
        assinatura.usuarioPremiums = new ArrayList<>();
        assinatura.usuarioPremiums.add(up1);
        assinatura.usuarioPremiums.add(up2);
        assinatura.usuarioPremiums.add(up3);
        assinatura.usuarioPremiums.add(up4);
        assinatura.usuarioPremiums.add(up5);
        assinatura.usuarioPremiums.add(up6);

        assinatura.usuarioGratuitos = new ArrayList<>();
        assinatura.usuarioGratuitos.add(new UsuarioGratuito("Pedro", "pedro@"));
        assinatura.usuarioGratuitos.add(new UsuarioGratuito("Carla", "carla@"));

        assinatura.UsuarioPremium();
        assinatura.UsuarioGratuitos();
        assinatura.AssinaturaEstilo();
    }
}
