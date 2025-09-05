public class Carro extends Veiculo {
    private String modelo;

    public Carro(int ano, String marca,String modelo) {
        super(ano, marca);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public void detalhes(){
        super.detalhes();
        System.out.println(" Ano:"+getAno()+" Modelo"+ getModelo());
    };
}
