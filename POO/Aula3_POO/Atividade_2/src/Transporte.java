public abstract class Transporte {
    private String marca;
    private double velocidade;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private double preco;

    public Transporte(String marca, double velocidade, double preco) {
        this.marca = marca;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public abstract double compra();
    public abstract void validacao();
    public abstract void lotacao();
    public abstract void manutencao();
    public abstract void mudarVelocidade();
    public abstract void horario();
    public abstract void atraso();

}
