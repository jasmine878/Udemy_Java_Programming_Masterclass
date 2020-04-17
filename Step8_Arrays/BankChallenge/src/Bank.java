import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Branch> getBranches() {
        return this.getBranches();
    }

    public void addBranch(String name) {
        branches.add(new Branch(name));
    }
}
