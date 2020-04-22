public class Parrot extends Bird{
    public Parrot(String name) {
        super(name);
    }

    //we don't need to include the eat and breathe methods because they're already overwritten in the Bird class

    @Override
    public void fly() {
        System.out.println("flitting from branch to branch");
    }
}
