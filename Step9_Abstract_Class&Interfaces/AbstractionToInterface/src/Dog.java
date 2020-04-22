//extend the Dog class from the Abstract class
public class Dog extends Animal{
    //normal child constructor
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breath out, repeat");
    }
}
