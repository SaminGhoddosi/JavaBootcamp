public class Gato extends Mamifero{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println("O gato está dormindo");
    };

}
