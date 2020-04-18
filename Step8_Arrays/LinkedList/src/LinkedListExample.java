import java.util.Iterator;
import java.util.LinkedList;

//a linked list of places to visit in Australia.
//we're using Capital cities in Australia

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");

        printList(placesToVisit);

    }

    //using an iterator
    //an iterator is another way of accessing and going through all entries in an Array, ArrayList, or LinkedList
    //it's an equivalent to a for loop
    private static void printList(LinkedList<String> places) {
        Iterator<String> i = places.iterator();

        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===============================");
    }
}
