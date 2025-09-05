import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Habilidade h1 = new Habilidade(1,"bola",10,Tipo.FOGO);
        Habilidade h2 = new Habilidade(2,"bos",40,Tipo.FOGO);
        Habilidade h3 = new Habilidade(3,"bol",20,Tipo.AGUA);
        Habilidade h4 = new Habilidade(4,"ba",30,Tipo.TERRA);
        ArrayList<Habilidade> habilidadesFogo = new ArrayList<>();
        habilidadesFogo.add(h1);
        habilidadesFogo.add(h2);

        ArrayList<Habilidade> habilidadesAgua = new ArrayList<>();
        habilidadesFogo.add(h3);
        habilidadesFogo.add(h4);

        PersonagemDeJogo p1 = new PersonagemDeJogo(1,"Lava",108,8,habilidadesFogo,Tipo.FOGO);
        PersonagemDeJogo p2 = new PersonagemDeJogo(2,"água",90,4,habilidadesAgua,Tipo.AR);



        while(true){
            p1.atacat(p2);
            p2.atacat(p1);
        }
    }
}