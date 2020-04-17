import java.util.ArrayList;
import java.util.Arrays;

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

    public void addTransactions(String name, double nextTransaction) {
        boolean foundCustomer = false;

        for (int i = 0; i < getCustomers().size(); i++) {
            if (getCustomers().get(i).getName().equals(name)) {
                getCustomers().get(i).getTransactions().add(nextTransaction);
                foundCustomer = true;
            }
        }

        if (foundCustomer) System.out.println("Sucessfully added transaction to customer");
        else System.out.println("Cannot find the customer");
    }

    public void getCustomerList() {
        for (int i = 0; i < getCustomers().size(); i++) {
            System.out.println(i + " " + getCustomers().get(i).getName());
        }
    }

    public void getCustomerTransactions(String name) {
        for (int i = 0;i < getCustomers().size(); i++) {
            if (getCustomers().get(i).getName().equals(name)) {
                ArrayList<Double> currentTransactions = getCustomers().get(i).getTransactions();

                System.out.println(Arrays.toString(currentTransactions.toArray()));
            }
        }
    }
}
