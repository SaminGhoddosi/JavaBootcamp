public class Diretor extends Pessoa {
   private double salario;

    public Diretor(int cpf, int id, String nome, double salario) {
        super(cpf, id, nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
