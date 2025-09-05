import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Especie e1 = new Especie("canino");
        Especie e2 = new Especie("felino");
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Cachorro c1 = new Cachorro("Rex",12,e1);
        Gato g1 = new Gato("miau",11,e2);
        animals.add(c1);
        animals.add(g1);
        for(Animal i : animals){
            System.out.println(i.fazerSom());
            i.dormir();
        }



    }
}