import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        
        addTransaction(initialTransaction);
    }

    public String getName() {
        return this.name;
    }

    public void addTransaction(double nextTransaction) {
        this.transactions.add(nextTransaction);
    }

}
