//this linked list is more like a double linked list since it is able to access next AND previous nodes.

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
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
                if (currentNode.next() != null) {
                    currentNode = currentNode.next();
                } else {
//                    currentNode.setNext(newNode);
//                    newNode.setPrevious(currentNode);
                    //since setNext returns the nextNode, we can just build off of the return value
                    currentNode.setNext(newNode).setPrevious(currentNode);
                    return true;
                }
                //newNode < currentNode, insert before currentNode
            } else if (comparison > 0) {
                if(currentNode.previous() != null) {
                    currentNode.previous.setNext(newNode);
                    newNode.setPrevious(currentNode.previous());
//                    newNode.setNext(currentNode);
//                    currentNode.setPrevious(newNode);
                    //since setPrevious returns the previousNode, we can just build off of the return value
                    newNode.setNext(currentNode).setPrevious(newNode);
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
        if (item != null) System.out.println("Deleting item " + item.getValue());

        ListItem currentItem = this.root;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);

            if (comparison == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
//                    this.root.setPrevious(null);
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }

                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                System.out.println("item was not found in this sorted list.  Unable to delete");
                return false;
            }
        }

        System.out.println("You are deleting null");
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) System.out.println("This list is empty");

        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}
