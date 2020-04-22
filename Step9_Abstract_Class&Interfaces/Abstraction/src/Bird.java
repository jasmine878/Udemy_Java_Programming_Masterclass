//Not all birds can fly.  So instead of creating a fly method
//create an Abstract Bird class that extends Animal and also
//has an abstract fly method that individual Bird objects can implement

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breath out, repeat");
    }

    public abstract void fly();
}
