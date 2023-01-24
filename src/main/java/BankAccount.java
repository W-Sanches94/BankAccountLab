import java.time.LocalDate;

public class BankAccount {

    // PROPERTIES

    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public int accountNumber;
    public double balance;

    // CONSTRUCTOR

    public BankAccount (String inputFirstName, String inputLastName, LocalDate inputDateOfBirth, int inputAccountNumber, double balance){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }

    // METHODS / BEHAVIOURS

//    Create a method called deposit() that takes in an amount updates the balance of the BankAccount.

    //accept an amount as deposit
    // add to balance
    // increment += ammount

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

//    Create a method called withdrawal() that takes in an amount and updates the balance of the BankAccount.

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

    public double getBalance(){
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
