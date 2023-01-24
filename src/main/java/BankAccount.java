import java.time.LocalDate;

public class BankAccount {

    //Properties

    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    int accountNumber;
    Float balance;

    //Constructor

    public BankAccount (String inputName, String lastName, LocalDate dateOfBirth, int accountNumber, Float balance){
        this.firstName = inputName;
        this.lastName = inputName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

}
