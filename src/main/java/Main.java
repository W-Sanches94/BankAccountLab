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
                51143691,
                9803.72);

        BankAccount bankAccount3 = new BankAccount(
                "emily",
                "stuart",
                LocalDate.of(1985,02,07),
                61078526,
                8267.10);

        bankAccount3.deposit(1298);
        System.out.println(bankAccount3.getBalance());

        bankAccount.withdraw(500);
        System.out.println(bankAccount.getBalance());

    }

}
