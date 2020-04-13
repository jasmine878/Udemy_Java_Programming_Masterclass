public class Main {
    public static void main(String[] args) {
        Hamburger baseBurger = new Hamburger("Standard", "sesame", "beef", 2.99);

        System.out.println("Total burger price is " + baseBurger.itemizeHamburger());                                      //expect 2.99
        System.out.println();

        baseBurger.addTopping1("cheese", 1);
        System.out.println("Total burger price is " + baseBurger.itemizeHamburger());          //expect 3.98
    }
}
