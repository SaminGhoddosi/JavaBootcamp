public class Moto extends Veiculo {
    public int _cilindradas;
    public boolean _temBagageiro;

    public Moto(String _marca, String _modelo, int _ano, int _cilindradas) {
        super(_marca, _modelo, _ano);
        this._cilindradas = _cilindradas;
    }

    public String informacoes() {
        String texto = "Marca: " + this.marca + " Modelo: " + this.modelo + " Número Cilindradas: " + this._cilindradas;
        return texto;
    }
}


