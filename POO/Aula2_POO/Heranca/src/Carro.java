public class Carro extends Veiculo {
    public int _numeroPortas;
    public String _tipoCombustivel;

    public Carro(String _marca, String _modelo, int _ano, int _numeroPortas, String _tipoCombustivel) {
        super(_marca, _modelo, _ano);
        this._numeroPortas = _numeroPortas;
        this._tipoCombustivel = _tipoCombustivel;
    }

    public String informacoes() {
        String texto = "Marca: " + this.marca + " Modelo: " + this.modelo + " Número Portas: " + this._numeroPortas;
        return texto;
    }
}

