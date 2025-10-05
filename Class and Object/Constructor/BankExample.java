
class BankAccount {

    String AccountHolder;
    double balance;

    // Constructor: 
    BankAccount(String name, double amount) {
        AccountHolder = name;
        balance = amount;
    }

    void diposit(double newAmount) {
        balance += newAmount;
        System.out.println(newAmount + "deposited, New balance : " + balance);
    }

    void withdrow(double Amount) {
        if(Amount <= balance)
        {
            balance -= Amount;
            System.out.println(Ammount + "withdrawn, Remaining balance : " + balance);
        } else {
            System.out.println("Insufficient balance !");
        }
    }

    void showBalance() {
        System.out.println(AccountHolder + "'s  balance': " + balance);
    }
}

public class BankExample {  // Class name must match file name
    public static void main(String[] args) {
        // --- Your code starts here ---
        // BankAccount acc1 = new BankAccount("Mojahid", 5000);
        BankAccount client1 = new BankAccount("Mojahid", 5000);

       client1.showBalance();
       client1.diposit(2500);
       client1.withdrow(3000);
       client1.withdrow(8000);
    }
}
