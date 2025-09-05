public class Personagem {
    private String nome;
    private int vida;
    private int nivel;

    public int getQuantidadeXp() {
        return quantidadeXp;
    }

    public void setQuantidadeXp(int quantidadeXp) {
        this.quantidadeXp = quantidadeXp;
    }

    private int quantidadeXp;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public Personagem(String nome, int vida) {
        this.nivel = 1;
        this.nome = nome;
        this.vida = vida;
    }

    public void tomarDano(int dano){
        int vidaNova = this.getVida() - dano;
        if(vidaNova >=0 && vidaNova <=100){
            this.setVida(vidaNova);
            System.out.println("Depois do dano de: "+dano+" A vida fiou de "+this.getVida());
        }
        else{
            System.out.println("A vida ficou abaixo de 0 ou acima de 100. Dano incorreto!");
        }
    }
    public void curar(int curar){
        int vidaNova = this.getVida() + curar;
        if(vidaNova >=0 && vidaNova <=100){
            this.setVida(vidaNova);
            System.out.println("Depois da cura de: "+curar+" A vida fiou de "+this.getVida());
        }
        else{
            System.out.println("A vida ficou abaixo de 0 ou acima de 100. Cura incorreta!");
        }
    }

    public void ganharExperiencia(int xp){
        int novaQuantidade = getQuantidadeXp() + xp;
        setQuantidadeXp(novaQuantidade);
        if(getQuantidadeXp() > 100 && getQuantidadeXp() <=200){
            setNivel(2);
        }
        else if(getQuantidadeXp() > 200 && getQuantidadeXp() <=300){
            setNivel(3);
        }
        System.out.println("O nível do cidadão é de:"+ getNivel());
    }

}
