import java.util.Scanner;

public class FuncionarioMensalista extends Funcionario {
    Scanner sc = new Scanner(System.in);
    private double valorSalarioFixo;

    public FuncionarioMensalista(String cpf, int hora, String nome, double valorSalarioFixo) {
        super(cpf, nome);
        this.valorSalarioFixo = valorSalarioFixo;

    }

    @Override
    public double calcularSalario() {
        return this.valorSalarioFixo;
    }
}
