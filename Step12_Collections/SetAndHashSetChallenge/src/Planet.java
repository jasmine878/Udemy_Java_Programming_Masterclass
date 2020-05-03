public class Planet extends HeavenlyBody {

    //in the constructor we're passing the enum constant for Planet
    //it would never be different in the Planet Class
    //we use BodyTypes.PLANET, because it's a public static final variable and we can access
    //in any of our subClasses
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }


}
