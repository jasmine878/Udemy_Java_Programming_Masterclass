import java.util.ArrayList;

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
}
