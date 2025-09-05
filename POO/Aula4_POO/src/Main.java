import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.add(new Carro(2024,"Pegout","208"));
        veiculos.add(new Aviao(2024,"Pegout","208"));
       for(Veiculo v : veiculos){
           v.detalhes();
       }
    }
}