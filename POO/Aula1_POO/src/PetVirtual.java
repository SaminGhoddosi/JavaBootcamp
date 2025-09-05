public class PetVirtual {
    public String nome;
    public int fome;
    public int felicidade;

    public PetVirtual(String nome, int fome, int felicidade){
        this.nome = nome;
        this.fome = fome;
        this.felicidade = felicidade;
    }
    public int alimentar(int quantidade){
        this.fome -=quantidade;
        return this.fome;
    }
    public int felicidade(int felicidade){
        this.felicidade +=felicidade;
        return this.felicidade;
    }
    public void status(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("fome: "+ this.fome);
        System.out.println("felicidade: "+ this.felicidade);
    }
    public void fome(){
        if(this.fome>80){
            System.out.println("Seu animal está com fome");
            this.felicidade -=10;
        }
    }
}
