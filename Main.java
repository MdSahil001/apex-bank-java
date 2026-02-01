public class Main {
    public static void main(String[] args) {
        try {
            BankEngine engine = new BankEngine();

            // 1. Create Accounts
            SavingsAccount acc1 = new SavingsAccount("101", "Sahil", 5000.0);
            SavingsAccount acc2 = new SavingsAccount("102", "Zohra", 3000.0);

            // 2. Add to HashMap
            engine.addAccount(acc1);
            engine.addAccount(acc2);

            // 3. Perform a simple logic check
            System.out.println("Initial Balance of 101: " + engine.getAccount("101").getBalance());
            engine.getAccount("101").withdraw(1000);
            System.out.println("Balance after withdrawal: " + engine.getAccount("101").getBalance());

            // 4. Persistence
            engine.saveToDisk();
            engine.loadFromDisk();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}