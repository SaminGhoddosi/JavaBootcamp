public class Aviao extends Veiculo{
    private String companhia_aerea;

    public Aviao(int ano, String marca, String companhia_aerea) {
        super(ano, marca);
        this.companhia_aerea = companhia_aerea;
    }

    public String getCompanhia_aerea() {
        return companhia_aerea;
    }

    public void setCompanhia_aerea(String companhia_aerea) {
        this.companhia_aerea = companhia_aerea;
    }
    @Override
    public void detalhes(){
        System.out.println("Marca "+ getMarca() +" Ano:"+getAno()+" Companhia Aérea"+ getCompanhia_aerea());
    }
}
