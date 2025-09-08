import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Mamifero m1 = new Gato("gato");
//        Mamifero m2 = new Cachorro("caco");
//        m1.fazerSom();
//        m2.fazerSom();
//        m1.dormir();
        ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();
        mamiferos.add(new Gato("gato"));
        mamiferos.add(new Cachorro("caco"));
        for(Mamifero i : mamiferos){
            i.fazerSom();
            i.dormir();
        }


    }
}