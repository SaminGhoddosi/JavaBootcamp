import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Usuario u1 = new Usuario("Samin","123");
       Usuario u2 = new Usuario("Thiago","456");
       Usuario u3 = new Usuario("Raquel","789");
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
       Onibus o1 = new Onibus("Mercedez",1223,12,"Oi");
       Onibus o2 = new Onibus("asdf",12233,124,"Oi");
       Onibus o3 = new Onibus("Mercsdedez",12223,121,"Oi");
       ArrayList<Onibus> o = new ArrayList<Onibus>();
       o.add(o1);
       o.add(o2);
       o.add(o3);
       ArrayList<Transporte> t = new ArrayList<Transporte>();
       t.add(o1);
       t.add(o2);
       t.add(o3);
       o1.validacao();
       for(Transporte transportes : t){
           System.out.println(transportes.getVelocidade());
       }

    }
}