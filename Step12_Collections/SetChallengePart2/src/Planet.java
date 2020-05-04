public class Planet extends HeavenlyBody {

    //in the constructor we're passing the enum constant for Planet
    //it would never be different in the Planet Class
    //we use BodyTypes.PLANET, because it's a public static final variable and we can access
    //in any of our subClasses
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    //for the planet type, satellites are restricted to Moons
    //we should add a test here to make sure the parameter is a moon
    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
