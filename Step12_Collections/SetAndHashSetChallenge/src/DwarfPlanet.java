public class DwarfPlanet extends HeavenlyBody {

    //we're hardcoding the parameter in the super method to only take a Moon bodytype
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }

    //NOT SURE WHY WE'RE NOT OVERRIDING THE ADDSATELLITE METHOD HERE TOO
}
