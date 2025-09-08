import java.time.LocalDate;
import java.util.Date;

public class ReservaHotel {
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private Cliente cliente;
    private double valorDiaria;

    public ReservaHotel(LocalDate dataEntrada, LocalDate dataSaida, Cliente nomeCliente, double valorDiaria) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.cliente = nomeCliente;
        this.valorDiaria = valorDiaria;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Cliente getNomeCliente() {
        return cliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.cliente = nomeCliente;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void calcularTotal(int numeroDiarias){
        double valorTotal = getValorDiaria() * numeroDiarias;
        System.out.println("O valor total que o/a "+getNomeCliente().getNome()+" é de: "+valorTotal);
    }
    public void calcularTotal(int numeroDiarias, int desconto){
        double valorTotal = (getValorDiaria() * numeroDiarias);
        double valorTotalDesconto = valorTotal -(valorTotal *(desconto/100.0));
        System.out.println("O valor total com "+desconto+"% de desconto é de: "+ valorTotalDesconto);
    }
}
