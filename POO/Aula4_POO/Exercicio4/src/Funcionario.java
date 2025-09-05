public class Funcionario {
    private String nome;
    private double salario;
    private int carga_horaria;

    public Funcionario(int carga_horaria, String nome, double salario) {
        this.carga_horaria = carga_horaria;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcular_salario_mensal(){
        return getSalario()*getCarga_horaria();
    }
}
