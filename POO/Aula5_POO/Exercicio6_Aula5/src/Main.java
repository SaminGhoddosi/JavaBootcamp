import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new FuncionarioHorista("232324",2,"asf",10));
        funcionarios.add(new FuncionarioHorista("232324",2,"asf",10));
        funcionarios.add(new FuncionarioHorista("232324",2,"asf",10));
        funcionarios.add(new FuncionarioHorista("232324",2,"asf",10));
        funcionarios.add(new FuncionarioHorista("232324",2,"asf",10));
        funcionarios.add(new FuncionarioHorista("232324",2,"asf",10));
        funcionarios.add(new FuncionarioMensalista("232324",2,"asf",1000));
        for(Funcionario i : funcionarios){
            System.out.println("O salário de: "+i.getNome()+ "é de: "+i.calcularSalario());
        }
    }
}