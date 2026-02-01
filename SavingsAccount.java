public class SavingsAccount extends BankAccount {
    
    public SavingsAccount(String accNum, String name, double bal) {
        super(accNum, name, bal);
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Savings");
    }
}