public class Gato extends Animal{
    public Gato(String nome, int idade, Especie especie){
        super(nome, idade, especie);
    }
    @Override
    public String fazerSom(){
        return "Miau!";
    }
}
