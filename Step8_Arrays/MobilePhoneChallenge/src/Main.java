import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone cellphone = new MobilePhone("123-456-7890");

    public static void main(String[] args) {
        boolean quit = false;

        startPhone();
        printActions();

        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    cellphone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n" +
                            "1 - to print contacts\n" +
                            "2 - to add a new contact\n" +
                            "3 - to update an existing contact\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - query if an existing contact exists\n" +
                            "6 - to print a list of available actions");
        System.out.println("Choose your action: ");

    }

    private static void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phoneNumber);

        if(cellphone.addContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone number = " + phoneNumber);
        } else System.out.println("Contact " + name + "already exists");
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name");
        String updateName = scanner.nextLine();

        Contact updateContact = cellphone.queryContact(updateName);
        if (updateName != null) {
            System.out.println("Enter updated contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter updated contact phone number");
            String newPhoneNumber = scanner.nextLine();

            Contact newContact = Contact.createContact(newName, newPhoneNumber);
            cellphone.updateContact(updateContact, newContact);
            System.out.println("Successfully updated the record");
        } else {
            System.out.println(updateName + " does not exist.  Cannot update");
        }
    }

    
}
