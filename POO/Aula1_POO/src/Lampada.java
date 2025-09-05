public class Lampada {
    public boolean ligado;
    public String cor;
    public Lampada(boolean ligado, String cor){
        this.ligado = ligado;
        this.cor = cor;
    }
    public void mostrarEstado(){
        System.out.println("Ligado? "+ this.ligado);
        System.out.println("Cor: "+ this.cor);
    }
    public void trocarCor(String novaCor){
        if(this.ligado){
            this.cor = novaCor;
        }else{
            System.out.println("Ligue a lâmpada primeiro!");
        }

    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }

}
