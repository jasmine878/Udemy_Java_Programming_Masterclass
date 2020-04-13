public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private double price;
    private String topping1;
    private double toppingPrice1;
    private String topping2;
    private double toppingPrice2;
    private String topping3;
    private double toppingPrice3;
    private String topping4;
    private double toppingPrice4;

    public Hamburger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public void addTopping1(String name, double price) {
        this.topping1 = name;
        this.toppingPrice1 = price;
    }

    public void addTopping2(String name, double price) {
        this.topping2 = name;
        this.toppingPrice2 = price;
    }

    public void addTopping3(String name, double price) {
        this.topping3 = name;
        this.toppingPrice3 = price;
    }

    public void addTopping4(String name, double price) {
        this.topping4 = name;
        this.toppingPrice4 = price;
    }

    public double itemizeHamburger() {
        double cost = this.price;

        System.out.println(this.name + " hamburger on a " + this.rollType + " roll with " + this.meat + " costs " + this.price);

        if (this.toppingPrice1 > 0) {
            cost += this.toppingPrice1;
            System.out.println("Added " + this.topping1 + " for an extra " + this.toppingPrice1);
        }
        if (this.toppingPrice2 > 0) {
            cost += this.toppingPrice2;
            System.out.println("Added " + this.topping2 + " for an extra " + this.toppingPrice2);
        }
        if (this.toppingPrice3 > 0) {
            cost += this.toppingPrice3;
            System.out.println("Added " + this.topping3 + " for an extra " + this.toppingPrice3);
        }
        if (this.toppingPrice4 > 0) {
            cost += this.toppingPrice4;
            System.out.println("Added " + this.topping4 + " for an extra " + this.toppingPrice4);
        }

        return cost;
    }
}


