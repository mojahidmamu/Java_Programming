
class BankAccount {

    String AccountHolder;
    double balance;

    // Constructor: 
    BankAccount(String name, double amount) {
        AccountHolder = name;
        balance = amount;
    }
}

public class BankExample {  // Class name must match file name

    public static void main(String[] args) {
        // --- Your code starts here ---
        // BankAccount acc1 = new BankAccount("Mojahid", 5000);
        BankAccount acc1 = new BankAccount("Mojahid", 5000);
    }
}
