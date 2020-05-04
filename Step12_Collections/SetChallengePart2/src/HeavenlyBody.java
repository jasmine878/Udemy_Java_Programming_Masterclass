import java.util.HashSet;
import java.util.Set;

//make the HeavenlyBody class abstract to restrict instances to its Child Classes
public abstract class HeavenlyBody {
    private final String name;
    //    private final int bodyType;
    private final BodyTypes bodyType;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    //defining the various bodyTypes as constants
    //using separate declarations
//    public static final int STAR = 1;
//    public static final int PLANET = 2;
//    public static final int DWARF_PLANET = 3;
//    public static final int MOON = 4;
//    public static final int COMET = 5;
//    public static final int ASTEROID = 6;

    //ENUM - Java's way of grouping constants together
    //enums are types
    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    //an enum will only accept a parameter that is in its acceptable list
    public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }

    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public BodyTypes getBodyType() {
        return this.bodyType;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    //adds any type of heavenly body as a satellite to another
    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

  //we need to mark our equals method as final, because we plan on subclassing this Class
  //and we want to avoid problems with equals not being symmetric
    @Override
    public final boolean equals(Object obj) {
        //checking for referential equals meaning it's the same object or reference
        if (this == obj) {
            return true;
        }

        //check to see whether the objects we're comparing have the same class HeavenlyBody
        //if true, we can caste the obj as a HeavenlyBody type
        if (obj instanceof HeavenlyBody) {
            String objName = ((HeavenlyBody) obj).getName();
            BodyTypes objType = ((HeavenlyBody) obj).getBodyType();

            //if the names of the objects are the same and
            // the bodyTypes are the same, then return true as well
            return this.name.equals(objName) && this.bodyType.equals(objType);
        }

        return false;
    }

    //this is extremely easy because the String Class already has a built-in hash code method
    //and in this case, we're comparing only Strings .getName()
    @Override
    public int hashCode() {
//        System.out.println("hashcode called");
        //in this case we're using the hashCode() method from the String Class
        //we want to modify our hashCode() because various heavenly body types can now have the same names
        //we need to make our hashcode method more unique

        //fortunately, enum constants have a hashCode method as well
        return this.name.hashCode() + this.bodyType.hashCode() + 57;
    }

    //override the toString method to make printing out the heavenly bodies easier
    @Override
    public String toString() {
        return this.name + ": " + this.bodyType + ", " + this.orbitalPeriod;
    }

    //creating a static inner Class because it's closely tied to the Heavenly Body class
    //and will not be used in another other situation
    //this is a key class that gives the heavenly body class a field of type key

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        //if the key name and body type matches return true
        //We need to override the key and hashCodes methods, because we're going to be using a Key in a Map
        public boolean equals(Object obj) {
            Key key = (Key) obj;

            if (this.name.equals(key.getName())) {
                return this.bodyType == key.getBodyType();
            }

            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + this.bodyType.hashCode() + 57;
        }
    }
}
