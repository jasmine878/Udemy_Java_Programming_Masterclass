public abstract class ListItem {
    protected ListItem next = null;
    protected ListItem previous = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }
    
}
