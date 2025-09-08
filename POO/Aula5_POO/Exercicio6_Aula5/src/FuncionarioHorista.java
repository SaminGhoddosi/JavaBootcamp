import java.util.Scanner;

public class FuncionarioHorista extends  Funcionario{
    Scanner sc = new Scanner(System.in);
  private double valorHora;
    public FuncionarioHorista(String cpf, int hora, String nome, double valorHora) {
        super(cpf, nome);
        this.valorHora = valorHora;

    }

    @Override
    public double calcularSalario() {
        System.out.println("Quantas horas trabalhou?");
        int hora = sc.nextInt();
        return this.valorHora * hora;
    }
}
