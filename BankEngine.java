import java.io.*;
import java.util.*;

public class BankEngine {
    // HashMap for O(1) retrieval
    private HashMap<String, BankAccount> accountMap = new HashMap<>();

    public void addAccount(BankAccount acc) {
        accountMap.put(acc.getAccountNumber(), acc); // HashMap function: put
    }

    public BankAccount getAccount(String accNum) {
        return accountMap.get(accNum); // HashMap function: get
    }

    // Saving using FileOutputStream (Byte-level handling)
    public void saveToDisk() throws Exception {
        FileOutputStream fos = new FileOutputStream("accounts_data.txt");
        for (BankAccount acc : accountMap.values()) {
            String record = acc.getAccountNumber() + "," + acc.getBalance() + "\n";
            fos.write(record.getBytes()); // Converting string to bytes
        }
        fos.close();
        System.out.println("Data saved using FileOutputStream.");
    }

    // Loading using FileInputStream
    public void loadFromDisk() throws Exception {
        FileInputStream fis = new FileInputStream("accounts_data.txt");
        int i;
        System.out.println("--- Reading Data from File ---");
        while ((i = fis.read()) != -1) {
            System.out.print((char) i); // Casting byte to char
        }
        fis.close();
    }
}