//We need to implement the Comparable class because we're creating a Linked HashMap which is sorted
public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantity;
    private int shoppingCart;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
        this.shoppingCart = 0;
    }

    //overload the Constructor method in case we start with a quantity > 0
    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustQuantity(int quantity) {
        //quantity can be positive or negative
        //we don't want to save the adjustment unless our quantity remains positive
        int newQuantity = this.quantity + quantity;

        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        //return true if the obj shares the same reference to this
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;

        String objName = ((StockItem) obj).getName();

        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode called");

        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem item) {
        System.out.println("Entering StockItem.compareTo");

        if (this == item) return 0;

        //we have to always check for null, because if we invoke a method on a null value, it will break our code
        //we're using the in-built compareTo method for a String
        if (item != null) return this.name.compareToIgnoreCase(item.getName());

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
