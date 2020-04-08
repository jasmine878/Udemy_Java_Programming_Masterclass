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
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
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
