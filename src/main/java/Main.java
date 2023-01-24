import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(
                "john",
                "smith",
                LocalDate.of(1990,05,12),
                27126059,
                7850.29);

        BankAccount bankAccount2 = new BankAccount(
                "jane",
                "doe",
                LocalDate.of(1985,02,07),
                27126059,
                9803.72);

    }
}
