import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

        placesToVisit.remove(4);
        printList(placesToVisit);

        LinkedList<String> orderedPlaces = new LinkedList<String>();
        addInOrder(orderedPlaces, "Sydney");
        addInOrder(orderedPlaces, "Melbourne");
        addInOrder(orderedPlaces, "Brisbane");
        addInOrder(orderedPlaces, "Perth");
        addInOrder(orderedPlaces, "Canberra");
        addInOrder(orderedPlaces, "Adelaide");
        addInOrder(orderedPlaces, "Darwin");
        printList(orderedPlaces);

        addInOrder(orderedPlaces, "Alice Springs");
        addInOrder(orderedPlaces, "Darwin");
        printList(orderedPlaces);

        visit(orderedPlaces);
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

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {

            int comparison = stringListIterator.next().compareTo(newCity);

            //if comparison == 0, it means the two values are equal
            //we don't want to add duplicates
            if(comparison == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //newCity should appear before the current one
                //Adelaide                          Brisbane
                //.next() means we already moved the pointer to the next element
                stringListIterator.previous();
                //the add() method in ListIterator inserts at the correct position, without providing an index
                //.add() will insert before the position
                stringListIterator.add(newCity);

                return true;
            } else if (comparison < 0) {
                //move on to the next city.
                //.next() will automatically do this so we don't have to do anything here
            }
        }

        //if we don't find any greater values than we just add the newCity to the end of the file
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    //if user was going backwards instead of forwards
                    //additional check to move the cursor forward to get to the right starting place
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        //we're at the end of the list.  We can't go forward anymore
                        goingForward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        //we're at the beginning of the list.  We can go backwards anymore
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit\n" +
                            "1 - go to next city\n" +
                            "2 - go to previous city\n" +
                            "3 - print menu options");
    }
}
