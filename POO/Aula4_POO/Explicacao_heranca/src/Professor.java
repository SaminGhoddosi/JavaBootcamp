import java.util.ArrayList;

public class Professor extends Pessoa {
    private double gasolina;
    private ArrayList<Escola> escola;

    public Professor(int cpf, int id, String nome, ArrayList<Escola> escola, double gasolina) {
        super(cpf, id, nome);
        this.escola = escola;
        this.gasolina = gasolina;
    }

    public ArrayList<Escola> getEscola() {
        return escola;
    }

    public void setEscola(ArrayList<Escola> escola) {
        this.escola = escola;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    @Override
    public void algumaCoisa(){
        System.out.println("Oi");
    }

}
