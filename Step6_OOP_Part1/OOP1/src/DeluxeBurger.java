public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String rollType, String meat, double price) {
        super("Deluxe", rollType, meat, price);
        super.addTopping1("Chips", 2);
        super.addTopping2("root beer", 1);
    }

    @Override
    public void addTopping1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addTopping2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addTopping3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addTopping4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
