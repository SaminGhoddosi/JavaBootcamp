import java.util.ArrayList;
import java.util.Scanner;

public class PersonagemDeJogo {

       public int id;
       public String nome;
       public int vida;
       public int forca;
       public ArrayList<Habilidade> habilidades;
       public Tipo fraqueza;
       Scanner sc = new Scanner(System.in);

    public PersonagemDeJogo(int id, String nome, int vida, int forca, ArrayList<Habilidade> habilidades, Tipo fraqueza ) {
        this.id = id;
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.habilidades = new ArrayList<Habilidade>();
        this.fraqueza = fraqueza;

    }

    public void atacat(PersonagemDeJogo personagem){
        System.out.println("Escolha uma habilidade:");
        for(int i = 0; i<habilidades.size();i++){
            System.out.println(i+" - "+habilidades.get(i).nome);
        }
        System.out.println();
        System.out.println("Habilidade:");
        int indice = sc.nextInt();
        Habilidade habilidadeUsada = habilidades.get(indice);
    }
    public void receberDano(Habilidade habilidade){
        if(habilidade.tipo == this.fraqueza){
            int dano = habilidade.dano*2;
            this.vida -= dano;
            System.out.println(this.nome+" Recebeu "+dano+ " de dano" );
        }
    }
}
