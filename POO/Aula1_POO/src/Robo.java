public class Robo {
    public String nome;
    public int energia;
    public Robo(String nome, int energia){
        this.nome = nome;
        this.energia = energia;
    }
    public void executarTarefa(String tarefa){
        if(this.energia >=10){
            System.out.println("Tarefa: "+ tarefa + " foi executada e 10 de energia foi gasto");
            this.energia -=10;
        }
        else{
            System.out.println("Recarregue primeiro");
        }
    }
    public void recarregar(){
        this.energia = 100;
    }
    public void status(){
        System.out.println("Nível de energia é de: "+this.energia);
    }



}
