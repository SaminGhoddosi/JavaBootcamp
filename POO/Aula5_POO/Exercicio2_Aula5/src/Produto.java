public  class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adiconarEstoque(int quantidade){
        setQuantidade(getQuantidade() + quantidade);
        System.out.println("Quantidade adicionada! Agora a quantidade é de: "+ getQuantidade());
    }
    public void adiconarEstoque(int quantidade, double preco){
        setQuantidade(getQuantidade() + quantidade);
        setPreco((getPreco() - preco));
        System.out.println("Valor novo: "+getPreco()+" Quantidade nova: "+getQuantidade());

    }
}
