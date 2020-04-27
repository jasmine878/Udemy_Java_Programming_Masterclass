import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited.  Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdrawal(int amount) {
        int withdrawal = -amount;

        if (withdrawal < 0) {
            transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn.  Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }
}
