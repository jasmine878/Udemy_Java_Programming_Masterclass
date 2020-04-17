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

    public boolean doesCustomerExist(String name) {
        for (int i = 0; i < getCustomers().size(); i++) {
            if (getCustomers().get(i).getName().equals(name)) return true
        }
        return false;
    }

    public void addCustomer(String name, double initialTransaction) {
        if (doesCustomerExist(name)) {
            System.out.println("Cannot add new customer.  Name already exists.");
        } else {
            ArrayList<Double> newArrayList = new ArrayList<Double>();
            newArrayList.add(initialTransaction);

            Customer newCustomer = new Customer(name, newArrayList);

            getCustomers().add(newCustomer);
            System.out.println("Successfuly added new customer");
        }
    }

    public void addTransactions(String name, double nextTransaction) {
        if (doesCustomerExist(name)) {
            for (int i = 0; i < getCustomers().size(); i++) {
                if (getCustomers().get(i).getName().equals(name)) {
                    getCustomers().get(i).getTransactions().add(nextTransaction);
                    System.out.println("Sucessfully added transaction to customer");
                }
            }
        } else System.out.println("Cannot find the customer.  Unable to add transaction.");
    }

    public void getCustomerList() {
        for (int i = 0; i < getCustomers().size(); i++) {
            System.out.println(i + " " + getCustomers().get(i).getName());
            System.out.print("Transactions: " );
            getCustomerTransactions(getCustomers().get(i).getName());
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
