public class HealthyBurger extends Hamburger{
    private String healthyTopping1;
    private double healthyToppingPrice1;
    private String healthyTopping2;
    private double healthyToppingPrice2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "brown rye", meat, price);
    }

    public void addHealthyTopping1(String name, double price) {
        this.healthyTopping1 = name;
        this.healthyToppingPrice1 = price;
    }

    public void addHealthyTopping2(String name, double price) {
        this.healthyTopping2 = name;
        this.healthyToppingPrice2 = price;
    }

    @Override
    public double itemizeHamburger() {
        double cost = super.itemizeHamburger();

        if (this.healthyToppingPrice1 > 0) {
            cost += this.healthyToppingPrice1;
            System.out.println("Added " + this.healthyTopping1 + " for an extra " + this.healthyToppingPrice1);
        }
        if (this.healthyToppingPrice2 > 0) {
            cost += this.healthyToppingPrice2;
            System.out.println("Added " + this.healthyTopping2 + " for an extra " + this.healthyToppingPrice2);
        }

        return cost;
    }
}
