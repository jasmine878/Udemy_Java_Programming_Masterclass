import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();

        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    //we created an inner Class here because we don't need a gear unless we refer to a Gearbox
    //a Gear isn't useful in its own right.  It needs to be coupled with a Gearbox to be useful
    //it doesn't make sense to talk about Gears, unless we talk about a Gearbox
    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
