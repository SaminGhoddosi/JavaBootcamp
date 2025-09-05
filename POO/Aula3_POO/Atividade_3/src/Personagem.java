import java.util.ArrayList;

public class Personagem {
    private String nome;
    private int nivel;
    private int experiencia;
    private ArrayList<Habilidade> habilidades;

    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.experiencia = 0;
        this.habilidades = new ArrayList<>();
    }
    public void aprenderHabilidade(Habilidade h) {
        habilidades.add(h);
        System.out.println(nome + " aprendeu " + h.getNome());
    }

    public void ganharExperiencia(int xp) {
        experiencia += xp;
        if (experiencia >= nivel * 100) {
            nivel++;
            experiencia = 0;
            System.out.println(nome + " subiu para o nível " + nivel + "!");
        }
    }

    public void mostrarHabilidades() {
        System.out.println("Habilidades de " + nome + ":");
        for (Habilidade h : habilidades) {
            System.out.println("- " + h.getNome() + " (Poder: " + h.getPoder() + ")");
        }
    }
}
