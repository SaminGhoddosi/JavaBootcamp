import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Heroi> herois = new ArrayList<>();
        Superman sp = new Superman();
        MulherMaravilha mm = new MulherMaravilha();
        Flash fh = new Flash();
        herois.add(sp);
        herois.add(mm);
        herois.add(fh);
        for(Heroi i : herois){
            i.usarPoder();
        }
    }
}