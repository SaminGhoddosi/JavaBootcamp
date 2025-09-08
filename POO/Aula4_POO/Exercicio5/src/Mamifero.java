public abstract class Mamifero implements IAnimal {
    private String nome;

    public Mamifero(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dormir(){
        System.out.println("O mamífero está dormindo");
    };

  @Override
  public abstract void fazerSom();
}
