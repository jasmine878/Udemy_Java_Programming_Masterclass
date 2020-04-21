import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        System.out.println();

        saveObject(tim);
        System.out.println();

        tim.setHitPoints(8);
        System.out.println(tim);
        System.out.println();

        tim.setWeapon("Stormbringer");
        saveObject(tim);
        System.out.println();
        loadObject(tim);
        System.out.println();
        System.out.println(tim);
    }

    // In Main, write a method that takes an object that implements the interface as a parameter and
    // "saves" the values e.g. calls the method defined in the interface.
    // We haven't covered I/O yet, so your method should just print the values to the screen.

    //objectToSave can be a player type
    //since Player implements Isaveable
    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    //simulates getting the data
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }


    // Also in the Main class, write a method that restores the values to a Saveable object
    // e.g. calls the method from the interface for populating fields (see above).

    //this method simulates getting values from a file since we haven't learned Java Input/Output yet
    //this allows you to type in as many values as the Class requires and returns an ArrayList
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
