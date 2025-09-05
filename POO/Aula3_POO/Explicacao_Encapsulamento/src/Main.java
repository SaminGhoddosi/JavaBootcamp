public class Main {
    public static void main(String[] args) {
      Filme filme = new Filme();
      filme.setTitulo("Titanic");// chama na Main, mas é a classe filme que está o mudando
        System.out.println(filme.getTitulo());
    }
}