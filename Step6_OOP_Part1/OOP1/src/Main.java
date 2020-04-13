public class Main {
    public static void main(String[] args) {
        Hamburger baseBurger = new Hamburger("Standard", "sesame", "beef", 2.99);

        System.out.println("Total burger price is " + baseBurger.itemizeHamburger());          //expect 2.99
        System.out.println();

        baseBurger.addTopping1("cheese", 1);
        System.out.println("Total burger price is " + baseBurger.itemizeHamburger());          //expect 3.98
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("veggie", 5.99);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());       //expect 5.99
        System.out.println();

        healthyBurger.addTopping1("tomato", .50);
        healthyBurger.addHealthyTopping1("avocado", 2);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());      //expect 8.50
    }
}
