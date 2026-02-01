import java.io.Serializable;

// Abstract class defines the blueprint for all accounts
public abstract class BankAccount implements Serializable {
    private String accountNumber;
    private String ownerName;
    protected double balance; // Protected so child classes can see it

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Encapsulation: Accessing private data through public methods
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    // Logic methods
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (amount > balance) throw new Exception("Insufficient balance!");
        balance -= amount;
    }

    // Abstract method: To be implemented by specific account types
    public abstract void showAccountType();
}