// Create a simple interface (tip: name it Saveable or ISaveable)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods,

import java.util.List;

//by using a List instead of an ArrayList in our Interface, this means we can use any type of list in the future
public interface ISaveable {

    // one to return an ArrayList of values to be saved and the other
    List<String> write();

    // to populate the object's fields from an ArrayList (parameter).
    void read(List<String> savedValues);
}
