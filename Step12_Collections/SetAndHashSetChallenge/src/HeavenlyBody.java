import java.util.HashSet;
import java.util.Set;

//This is a program that models the heavenly bodies in the solar system
//including planets, moons, asteroids, and comets
public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }

    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    //adds a moon to our solar system or Set
    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    //if we don't use the @Override notation then our equals method overloads the one from the base class
    //instead of overriding it and it ultimately will never be used by the Collection
    @Override
    public boolean equals(Object obj) {
        //checking for referential equals meaning it's the same object or reference
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());

        //check to see whether object is null
        //check to see whether the objects we're comparing have the same class HeavenlyBody
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();

        //if the names of the objects are the same then return true as well
        return this.name.equals(objName);
    }

    //this is extremely easy because the String Class already has a built-in hash code method
    //and in this case, we're comparing only Strings .getName()
    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        //in this case we're using the hashCode() method from the String Class
        return this.name.hashCode() + 57;
    }
}
