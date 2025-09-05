public class Vendedor extends Funcionario{
    private int total_vendas;

    public Vendedor(int carga_horaria, String nome, double salario, int total_vendas) {
        super(carga_horaria, nome, salario);
        this.total_vendas = total_vendas;
    }

    public int getTotal_vendas() {
        return total_vendas;
    }

    public void setTotal_vendas(int total_vendas) {
        this.total_vendas = total_vendas;
    }

    public double calcular_salario_mensal(){
        double comissao = getTotal_vendas()*10;
        return (getSalario()*getCarga_horaria())+comissao;
    }
}
