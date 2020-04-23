public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.next;
    }

    @Override
    public ListItem previous() {
        return this.previous;
    }

    @Override
    ListItem setNext(ListItem nextItem) {
        this.next = nextItem;

        return this.next;
    }

    @Override
    ListItem setPrevious(ListItem previousItem) {
        this.previous = previousItem;

        return this.previous;
    }

    @Override
    public int compareTo(ListItem compareItem) {
        //if compareItem < this.value return < 0
        //if compareItem > this.value return > 0
        //if compareItem == this.value return 0
        if (compareItem != null) {
            return((String) super.getValue()).compareTo((String) compareItem.getValue());
        } else {
            //if parameter == null, than it is less than the current node
            return -1;
        }
    }
}
