import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    //find customer is a method that's only used internally in the Branch class
    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer currentCustomer = this.customers.get(i);

            if (currentCustomer.getName().equals(name)) return currentCustomer;
        }
        return null;
    }

    public boolean addCustomer(String name, double initialTransaction) {
        if (findCustomer(name) != null) return false;
        else {
            this.customers.add(new Customer(name, initialTransaction));
            return true;
        }
    }

    public boolean addTransactions(String name, double nextTransaction) {
        Customer foundCustomer = findCustomer(name);

        if (foundCustomer != null) {
            foundCustomer.addTransaction(nextTransaction);

            return true;
        }

        return false;
    }
}
