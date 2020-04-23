//this linked list is more like a double linked list since it is able to access next AND previous nodes.

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList() {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    //as we add each node, we're supposed to sort it in a particular order
    @Override
    public boolean addItem(ListItem newNode) {
        if (this.root == null) {
            this.root = newNode;
            return true;
        }
        ListItem currentNode = this.root;

        while(currentNode != null) {
            int comparison = currentNode.compareTo(newNode);

            //newNode is greater than currentNode, so move to the NEXT node until we find the appropriate place
            if (comparison < 0) {
                if (currentNode != null) {
                    currentNode = currentNode.next();
                } else {
                    currentNode.setNext(newNode);
                    newNode.setPrevious(currentNode);
                    return true;
                }
                //newNode < currentNode, insert before currentNode
            } else if (comparison > 0) {
                if(currentNode.previous() != null) {
                    currentNode.previous.setNext(newNode);
                    newNode.setPrevious(currentNode.previous());
                    newNode.setNext(currentNode);
                    currentNode.setPrevious(newNode);
                } else {
                    //the currentNode is the rootNode
                    currentNode.setPrevious(newNode);
                    newNode.setNext(currentNode);
                    this.root = newNode;
                }

                return true;
            } else {
                //newNode.value() == currentNode.value()
                System.out.println(newNode.getValue() + " is already present, not added");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
