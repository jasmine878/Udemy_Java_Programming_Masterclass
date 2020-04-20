import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    // In Main, write a method that takes an object that implements the interface as a parameter and
    // "saves" the values e.g. calls the method defined in the interface.
    // We haven't covered I/O yet, so your method should just print the values to the screen.








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