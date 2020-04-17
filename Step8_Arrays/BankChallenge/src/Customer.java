public class Customer {
    private String name;
    private double initialTransaction;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.initialTransaction = initialTransaction;
    }

    public String getName() {
        return this.name;
    }

    public double getInitialTransaction() {
        return this.initialTransaction;
    }
}
