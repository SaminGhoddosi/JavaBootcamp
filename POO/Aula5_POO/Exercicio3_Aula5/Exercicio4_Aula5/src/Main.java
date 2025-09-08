import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("123234","asmin","1234234");
        ReservaHotel rh1 = new ReservaHotel(LocalDate.of(2025,12,10),LocalDate.of(2025,11,10),c1,100);
        rh1.calcularTotal(10);
        rh1.calcularTotal(10,10);
    }
}