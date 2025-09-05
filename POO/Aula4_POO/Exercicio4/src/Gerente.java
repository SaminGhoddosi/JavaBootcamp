public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(int carga_horaria, String nome, double salario, double bonus) {
        super(carga_horaria, nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcular_salario_mensal(){
        return (getSalario()*getCarga_horaria())+getBonus();
    }
}
