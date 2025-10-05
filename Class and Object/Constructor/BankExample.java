
class BankAccount {

    String AccountHolder;
    double balance;

    // Constructor: 
    BankAccount(String name, double amount) {
        AccountHolder = name;
        balance = amount;
    }

    void deposit(double newAmount) {
        balance += newAmount;
        System.out.println(newAmount + " deposited, New balance : " + balance);
    }

    void withdraw(double costAmount) {
        if (costAmount <= balance) {
            balance -= costAmount;
            System.out.println(costAmount + " withdrawn, Remaining balance : " + balance);
        } else {
            System.out.println("Insufficient balance !");
        }
    }

    void showBalance() {
        System.out.println(AccountHolder + " balance: " + balance);
    }
}

public class BankExample {  // Class name must match file name
    public static void main(String[] args) {
        // --- Your code starts here ---
        BankAccount client1 = new BankAccount("Mojahid", 5000);

        client1.showBalance();
        client1.deposit(2500);
        client1.withdraw(3000);
        client1.withdraw(8000);
    }
}
