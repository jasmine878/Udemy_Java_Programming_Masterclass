import java.util.ArrayList;
import java.util.Arrays;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return this.name;
    }

//    public ArrayList<Branch> getBranches() {
//        return this.getBranches();
//    }

    //find branch is a method that's only used internally in the Bank class
    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch currentBranch = this.branches.get(i);

            if (currentBranch.getName().equals(name)) return currentBranch;

        }
        return null;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            this.branches.add(new Branch(name));
            return true;
        }

        return false;
    }

    public boolean addNewCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.addTransactions(customerName, amount);
        }

        return false;
    }


    public boolean getCustomerList(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);

            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer currentCustomer = branchCustomers.get(i);

                System.out.println((i+1) + " " + currentCustomer.getName());

                if (showTransactions) {
//                    getCustomerTransactions(Customer currentCustomer);
                    System.out.print("Transactions: " + Arrays.toString(currentCustomer.getTransactions().toArray()));
                }

                return true;
            }
        }

        return false;
    }

//    public void getCustomerTransactions(Customer customer) {
//        ArrayList<Double> currentTransactions = customer.getTransactions();
//
//        for (int i = 0;i < currentTransactions.size(); i++) {
//            if (currentTransactions.get(i).getName().equals(name)) {
//                ArrayList<Double> currentTransactions = getCustomers().get(i).getTransactions();
//
//                System.out.println(Arrays.toString(currentTransactions.toArray()));
//            }
//        }
//    }
}
