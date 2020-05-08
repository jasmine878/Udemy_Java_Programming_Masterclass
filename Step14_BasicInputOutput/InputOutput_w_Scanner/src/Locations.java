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

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object o) {
        return false;
    }

    @Override
    public boolean containsValue(Object o) {
        return false;
    }

    @Override
    public Location get(Object o) {
        return null;
    }

    @Override
    public Location put(Integer integer, Location location) {
        return null;
    }

    @Override
    public Location remove(Object o) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> map) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Integer> keySet() {
        return null;
    }

    @Override
    public Collection<Location> values() {
        return null;
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return null;
    }
}
