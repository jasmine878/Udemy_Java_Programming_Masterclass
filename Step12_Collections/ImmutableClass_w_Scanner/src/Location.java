import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = exits;

        this.exits.put("Q", 0);
    }

    public int getLocationID() {
        return this.locationID;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, Integer> getExits() {                //we're putting exits in the constructor
        return new HashMap<String, Integer>(exits);         //returns a copy of the exits HashMap
    }

    //remove since exits are now included in the constructor
//    public void addExit(String direction, int location) {
//        exits.put(direction, location);
//    }
}
