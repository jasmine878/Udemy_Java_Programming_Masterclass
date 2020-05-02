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
}
