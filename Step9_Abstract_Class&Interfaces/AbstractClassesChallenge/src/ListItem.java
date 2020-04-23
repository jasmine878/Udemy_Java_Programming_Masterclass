public abstract class ListItem {
    //we're using protected, because we need to be able to access these variables from our subclass
    protected ListItem next = null;
    protected ListItem previous = null;
    protected Object value;

    //constructor
    public ListItem(Object value) {
        this.value = value;
    }

    //getter
    public Object getValue() {
        return value;
    }

    //setter
    public void setValue(Object value) {
        this.value = value;
    }

    //abstract methods
    abstract ListItem next();
    abstract ListItem previous();
    abstract ListItem setNext(ListItem nextItem);
    abstract ListItem setPrevious(ListItem previousItem);
    abstract int compareTo(ListItem compareItem);
}
