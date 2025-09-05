public abstract class Animal {
    public String _nome;
    public int _idade;
    public Especie _especie;
    public Animal(String nome, int idade, Especie especie){
        this._nome = nome;
        this._idade = idade;
        this._especie = especie;
    }
    public abstract String fazerSom();
    public void dormir(){
        System.out.println("O animal está dormindo");
    }

}
