import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - to print choice options.");
        System.out.println("\t 1 - to print the list of grocery items");
        System.out.println("\t 2 - to add an item to the list");
        System.out.println("\t 3 - to modify an item in the list");
        System.out.println("\t 4 - to remove an item from the list");
        System.out.println("\t 5 - to search for an item in the list");
        System.out.println("\t 6 - to quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter a grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }
}
