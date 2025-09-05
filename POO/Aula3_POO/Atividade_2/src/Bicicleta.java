import java.util.Scanner;

public class Bicicleta extends Transporte{
    Scanner sc = new Scanner(System.in);

    public Bicicleta(String marca, double velocidade, double preco) {
        super(marca, velocidade, preco);
    }
    @Override
    public double compra(){
        double precoTotal = getVelocidade() * getPreco(); // não faz muito sentido, mas é só para exemplo
        return precoTotal;
    }
    @Override
    public void validacao(){
        System.out.println("Tem certeza que deseja comprar o ticket de bicicleta no valor de: "+ compra()+"?");
    }
    @Override
    public void lotacao(){
        System.out.println("O seu bicicleta está com lotação de 90%");
    }
    @Override
    public void manutencao(){
        System.out.println("O bicicleta de velocidade: "+this.getVelocidade()+ " fez a manutenção faz um mês");
    }
    @Override
    public void mudarVelocidade(){
        System.out.println("Antiga velocidade:"+this.getVelocidade()+"\n Nova velocidade:");
        double novaVelocidade = sc.nextDouble();
        this.setVelocidade(novaVelocidade);
    }
    @Override
    public void horario(){
        System.out.println("O horário do bicicleta é de: 10");
    }
    @Override
    public void atraso(){
        System.out.println("O bicicleta vai atrasar dois minutos");
    }
}
