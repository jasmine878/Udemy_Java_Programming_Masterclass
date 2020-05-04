import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        //we're adding the Moon to Earth's satellites HashSet
        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        //we're adding the Moon to Mar's satellites HashSet
        tempMoon = new Moon("Desimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        //we're adding the Moon to Mar's satellites HashSet
        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        //we're adding the Moon to Jupiter's satellites HashSet
        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        //we're adding the Moon to Jupiter's satellites HashSet
        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        //we're adding the Moon to Jupiter's satellites HashSet
        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        //we're adding the Moon to Jupiter's satellites HashSet
        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getKey());
        }
        System.out.println();

        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getKey());
        for (HeavenlyBody moon : body.getSatellites()) {
            System.out.println("\t" + moon.getKey());
        }
        System.out.println();

        HeavenlyBody body2 = solarSystem.get("Mars");
        System.out.println("Moons of " + body2.getKey());
        for (HeavenlyBody moon : body2.getSatellites()) {
            System.out.println("\t" + moon.getKey());
        }

        //we're adding all of the satellites from each planet to our new moons hashSet
        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        System.out.println();

        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        //we confirmed that our second pluto planet hasn't overwritten the first pluto planet
//        HeavenlyBody pluto = new Planet("Pluto", 842);
//        planets.add(pluto);

        //Our 2nd Pluto can be added as a DwarfPlanet since its a different type form the 1st Pluto
        //its being passed through our equals method and returns false
        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        for(HeavenlyBody planet : planets) {
            //we're using our override method for toString() here
            System.out.println(planet);
//            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }

        //a.equals(b) must return the same result as b.equals(a)
        //equals method should exhibit Symmetric Difference
        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));              //expect true
        System.out.println(earth2.equals(earth1));              //expect true
        System.out.println(earth1.equals(pluto));               //expect false
        System.out.println(pluto.equals(earth1));               //expect false
    }
}
