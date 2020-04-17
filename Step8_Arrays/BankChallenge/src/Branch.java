import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void addCustomer(String name, double initialTransaction) {
        ArrayList<Double> newArrayList = new ArrayList<Double>();
        newArrayList.add(initialTransaction);

        Customer newCustomer = new Customer(name, newArrayList);

        getCustomers().add(newCustomer);
    }
}
