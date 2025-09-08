import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itens =  new ArrayList<Item>();
        itens.add(new ProdutoFisico("Batata",10.1,Tipo.Verdura));
        itens.add(new ProdutoFisico("Batata1",120.1,Tipo.Fruta));
        itens.add(new ProdutoFisico("Batata2",103.1,Tipo.Fruta));
        itens.add(new ProdutoFisico("Batatasfa",10.41,Tipo.Grão));
        itens.add(new ProdutoDigital("Bataasdfta",410.1,Tipo.Grão));
        itens.add(new ProdutoDigital("Batfadsata",110.1,Tipo.Gelado));
        itens.add(new ProdutoDigital("Batatdsa",10.21,Tipo.Verdura));
        itens.add(new ProdutoDigital("Batasdta",140.1,Tipo.Grão));
        itens.add(new ProdutoFisico("Batsata",10.31,Tipo.Gelado));
        double valorTotal = 0;
        int quantidade = 0;
        for(Item i : itens){
            valorTotal += i.calcularPreco();
            quantidade++;
        }
        System.out.println("Você comprou: "+ quantidade+ "produtos. E o preço foi de: "+valorTotal+" reais.");
    }
}