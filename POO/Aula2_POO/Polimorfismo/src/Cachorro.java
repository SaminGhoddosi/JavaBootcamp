public class Cachorro extends Animal {
     public Cachorro(String nome, int idade, Especie especie){
         super(nome,idade,especie);
    }

    @Override
    public String  fazerSom() {
        return "Au au!";
    }
}
