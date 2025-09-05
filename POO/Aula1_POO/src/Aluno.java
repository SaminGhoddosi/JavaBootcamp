public class Aluno {
    public String nome;
    public int idade;
    public double altura;
    public int matricula;

    public Aluno(){

  // existe dois construtores, logo polimorfismo
    }// todo o aluno que eu for construir vai ter 30, isso é uma regra de negócio
    public Aluno(String nome, int idade, double altura, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.matricula = matricula;
    }
    public void mostrarDados(){
        System.out.println("Nome:      "+ this.nome);
        System.out.println("Idade:     "+ this.idade);
        System.out.println("Altura:    "+ this.altura);
        System.out.println("Matricula: "+ this.matricula);
    }
}
