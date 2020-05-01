import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //our hashMap has an Integer for the key and the Class Location for our values
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //create a Temporary Map to be our exits that we pass into our Constructor
        Map<String, Integer> tempExit = new HashMap<>();

        //the primitive int type gets converted to Integers through auto-boxing!
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<>();         //create a new HashMap for each room to put through our constructor
        tempExit.put("W", 2);       //location 1
        tempExit.put("N", 5);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        locations.put(1, new Location(1,"You are standing at the end of a road before a small brick building",tempExit));
 
        tempExit = new HashMap<>();         //location 2
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<>();         //location 3
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<>();         //location 4
        tempExit.put("W", 2);
        tempExit.put("N", 1);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<>();         //location 5
        tempExit.put("W", 2);
        tempExit.put("S", 1);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");                           //only impacts the tempExit copy, not the original!!
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();

            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            System.out.println("Enter a direction you want to go");
            String direction = scanner.nextLine().toUpperCase();

            if (direction.length() > 1) {
                String[] words = direction.split(" ");

                for (String word: words) {
                    if (vocabulary.containsKey(word)) {
                        System.out.println("found word " + word);
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
