//abstract class
public abstract class Animal {
    private String name;

    //normal class constructor method
    public Animal(String name) {
        this.name = name;
    }

    //abstract methods
    //by putting a semicolon, we're actually not implementing this method
    public abstract void eat();
    public abstract void breathe();

    //normal class getter method
    public String getName() {
        return name;
    }
}
