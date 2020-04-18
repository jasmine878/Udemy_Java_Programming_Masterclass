public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addNewCustomer("Adelaide", "Tim", 50.05);
        bank.addNewCustomer("Adelaide", "Mike", 175.34);
        bank.addNewCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addNewCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.getCustomerList("Adelaide", false);
    }

}
