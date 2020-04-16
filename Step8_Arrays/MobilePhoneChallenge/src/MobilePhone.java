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
            System.out.println("Contact already exists");
            return false;
        } else {
            myContacts.add(newContact);
            return true;
        }
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);

            if (contact.getName().equals(name)) return i;
        }

        return -1;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact;
    }
}
