public class Personagem {
    public enum Tipo{
        Guerreiro,Mago,Arqueiro
    }
    public String nome;
    public Tipo tipo;
    public int vida;
    public double forca;
    public Personagem(String nome, Tipo tipo, int vida, double forca ){
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.forca = forca;
    }
    public void atacar(Personagem alvo){
        if(alvo.tipo.equals(Tipo.Mago)){
            System.out.println(this.nome + " atacou o mago "+ alvo.nome);
        }
        else if(alvo.tipo.equals(Tipo.Arqueiro)){
            System.out.println(this.nome + " atacou o arqueiro "+ alvo.nome);
        }
        else{
            System.out.println(this.nome + " atacou o guerreiro "+ alvo.nome);
        }
    }
    public void receberDano(int dano, Personagem alvo){
       if(alvo.vida <= 0){
           System.out.println("O alvo já está morto");

       }
       else {
           alvo.vida -=dano;
           System.out.println("O personagem "+this.nome+ " tirou vida do "+alvo.nome + " e ele ficou com vida de :"+alvo.vida);
       }
    }
    public void morreu(){
        if(this.vida <= 0){
            System.out.println("O personagem "+ this.nome +" morreu. Acabou a luta");
        }
    }
    public void exibirStatus(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Força: "+this.forca);
        System.out.println("Vida: "+this.vida);

    }
}
