//converting Regular Variables class to use 'x' for all variable, method, and class names
//we want to see scope in play with same name variables and instances

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x() {
        System.out.println("Times table for " + x + ": ");
        for (int x = 1;x <= 12; x++) {
            System.out.println(this.x + " multiplied by " + x + " equals " + this.x * x);
        }
        System.out.println("===============================");
    }
}
