public class BankAccount {
    private int accountNumber;
    private double balance = 0;
    private String customerName;
    private String email;
    private int phoneNumber;

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.customerDeposit(100);               //balance = 100
        account.customerWithdrawal(40);             //balance = 60
    }

    public void customerDeposit(double amount) {
        this.balance += amount;
        System.out.println("Client's balance after deposit is: " + this.balance);
    }

    public void customerWithdrawal(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Client's balance after withdrawal is: " + this.balance);
        }
    }
}
