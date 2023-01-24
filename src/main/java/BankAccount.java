import java.time.LocalDate;

public class BankAccount {

    // PROPERTIES

    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    int accountNumber;
    Float balance;

    // CONSTRUCTOR

    public BankAccount (String firstName, String lastName, LocalDate dateOfBirth, int accountNumber, Float balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // METHODS / BEHAVIOURS

    // GETTERS

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public Float getBalance(){
        return this.balance;
    }

    // SETTERS

    public void setFirstName(String name){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
