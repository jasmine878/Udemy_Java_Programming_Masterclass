import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//we're moving our locations hashMap from the Main Class to a separate file or class
//this will clear up our Main class
//This is a Locations Class that implements the Map Interface
//and we're implementing the methods that are part of the Map Interface
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<>();

    //this is a static initialization block
    //static initialization blocks are only executed once when the Locations Class is loaded
    //this prevents users from creating another instance of the Locations Class
    static {
        //the primitive int type gets converted to Integers through auto-boxing!
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1,"You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("N", 1);

        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("S", 1);

    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    //we're not going to implement this for now
    @Override
    public void putAll(Map<? extends Integer, ? extends Location> map) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
