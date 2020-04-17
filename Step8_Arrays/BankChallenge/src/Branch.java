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

    public boolean doesCustomerExist(String name) {
        for (int i = 0; i < getCustomers().size(); i++) {
            if (getCustomers().get(i).getName().equals(name)) return true;
        }
        return false;
    }

    public boolean addCustomer(String name, double initialTransaction) {
        if (doesCustomerExist(name)) return false;
        else {
            this.customers.add(new Customer(name, initialTransaction));
            return true;
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
        } else System.out.println("Cannot find the customer.  Unable to add transaction");
    }

//    public void getCustomerList() {
//        for (int i = 0; i < getCustomers().size(); i++) {
//            System.out.println(i + " " + getCustomers().get(i).getName());
//            System.out.print("Transactions: " );
//            getCustomerTransactions(getCustomers().get(i).getName());
//        }
//    }
//
//    public void getCustomerTransactions(String name) {
//        for (int i = 0;i < getCustomers().size(); i++) {
//            if (getCustomers().get(i).getName().equals(name)) {
//                ArrayList<Double> currentTransactions = getCustomers().get(i).getTransactions();
//
//                System.out.println(Arrays.toString(currentTransactions.toArray()));
//            }
//        }
//    }
}
