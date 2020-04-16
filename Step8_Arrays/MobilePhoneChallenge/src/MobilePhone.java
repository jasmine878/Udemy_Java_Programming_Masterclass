import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    //constructor has a phone number and an empty ArrayList
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact newContact) {
        if (findContact(newContact.getName()) >= 0) {
            return false;
        } else {
            myContacts.add(newContact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactIndex = findContact(oldContact);

        if (oldContactIndex >= 0) {
            this.myContacts.set(oldContactIndex, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        int foundContactIndex = findContact(contact);

        if (foundContactIndex >= 0) {
            this.myContacts.remove(foundContactIndex);
            return true;
        } else {
            System.out.println(contact.getName() + " does not exist");
            return false;
        }
    }

    //we don't want to expose these private methods publicly
    //indexes should be hidden from the Main class
    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);

            if (contact.getName().equals(name)) return i;
        }

        return -1;
    }

    //we don't want to expose these private methods publicly
    //indexes should be hidden from the Main class
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    //lets the calling method know that the contact is on file
    //use this public method instead of our private methods when we're using our Main class
    //we're hiding the inner workings of our private methods in this public method
    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) return contact.getName();

        return null;
    }

    public Contact queryContact(String name) {
        int contactIndex = findContact(name);

        if (contactIndex > -1) return this.myContacts.get(contactIndex);
        else return null;
    }

    public void printContacts() {
        System.out.println("Contact List");

        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact currentContact = this.myContacts.get(i);
            System.out.println((i+1) + ". " +
                    currentContact.getName() + " -> " +
                    currentContact.getPhoneNumber());
        }
    }
}
