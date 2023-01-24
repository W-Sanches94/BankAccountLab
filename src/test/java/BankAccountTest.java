import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @BeforeEach
    void setUp() {

        BankAccount bankAccount = new BankAccount(
                "john",
                "smith",
                LocalDate.of(1990, 05, 12),
                27126059,
                7850.29);

        BankAccount bankAccount2 = new BankAccount(
                "jane",
                "doe",
                LocalDate.of(1985, 02, 07),
                51143691,
                9803.72);

        BankAccount bankAccount3 = new BankAccount(
                "emily",
                "stuart",
                LocalDate.of(1985, 02, 07),
                61078526,
                8267.10);

    }
    @Test
    void canDeposit() {

    }

    @Test
    void canWithdraw() {

    }

}
