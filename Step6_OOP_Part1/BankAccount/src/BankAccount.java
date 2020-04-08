public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default email", "Default phone");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
//        BankAccount account = new BankAccount("12345", 0.00, "Bob Brown",
//                "myemail@bob.com", "(087) 123-4567");
        BankAccount account = new BankAccount();

        System.out.println(account.getAccountNumber());                     //expect 12345
        System.out.println(account.getBalance());                           //expect 0.00

//        account.setAccountNumber("12345");
//        account.setCustomerName("Bob Brown");
//        account.setEmail("myemail@bob.com");
//        account.setPhoneNumber("(087) 123-4567");

        account.customerWithdrawal(100);             //expect error
        account.customerDeposit(50);                 //balance = 50
        account.customerWithdrawal(100);             //expect error
        account.customerDeposit(51);                 //balance 101
        account.customerWithdrawal(100);             //balance 1

        System.out.println();
        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println("Tims phone is: " + timsAccount.getPhoneNumber());
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
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
        } else {
            System.out.println("Only " + this.balance + " available.  Withdrawal not processed");
        }
    }
}
