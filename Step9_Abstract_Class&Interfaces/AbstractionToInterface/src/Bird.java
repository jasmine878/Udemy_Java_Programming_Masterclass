//Not all birds can fly.  So instead of creating a fly method
//create an Abstract Bird class that extends Animal and also
//has an abstract fly method that individual Bird objects can implement

//CONVERT THE ABSTRACT METHOD TO IMPLEMENT A CANFLY INTERFACE!
public class Bird extends Animal implements CanFly {
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

    //  REPLACE THE ABSTRACT METHOD OF FLY WITH THE INTERFACE CANFLY
//    public abstract void fly();


    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
