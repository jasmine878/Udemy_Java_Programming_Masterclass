import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name, ArrayList<Branch> branches) {
        this.name = name;
        this.branches = branches;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Branch> getBranches() {
        return this.getBranches();
    }
}
