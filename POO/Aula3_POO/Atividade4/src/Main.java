public class Main {
    public static void main(String[] args) {
      Personagem p1 = new Personagem("samin", 100);
      Personagem p2 = new Personagem("samin", 100);
        System.out.println(p2.getNome());
        p1.tomarDano(30);
        p1.curar(50);
        p1.ganharExperiencia(120);
    }
}