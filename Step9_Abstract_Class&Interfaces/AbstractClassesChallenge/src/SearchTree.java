public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

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
                //newNode is greater, move right if possible
                if (currentNode.next() != null) {
                    currentNode = currentNode.next();
                } else {
                    //we only need to set one direction with the tree
                    currentNode.setNext(newNode);
                    return true;
                }
                //newNode < currentNode, insert before currentNode
            } else if (comparison > 0) {
                //newNode is less, move left if possible
                if(currentNode.previous() != null) {
                    currentNode = currentNode.previous();
                } else {
                    currentNode.setPrevious(newNode);
                    return true;
                }
            } else {
                //newNode.value() == currentNode.value()
                System.out.println(newNode.getValue() + " is already present, not added");
                return false;
            }
        }
        //we'll never arrive to this point, but Java requires us to return a boolean for this method
        return false;
    }

    @Override
    public boolean removeItem(ListItem removeNode) {
        if (removeNode != null) {
            System.out.println("Deleting item " + removeNode.getValue());
        }
        ListItem currentNode = this.root;
        ListItem parentNode = currentNode;

        while (currentNode != null) {
            int comparison = currentNode.compareTo(removeNode);

            //if the removeNode is bigger than currentNode, keep moving next
            if (comparison < 0) {
                parentNode = currentNode;
                currentNode = currentNode.next();
                //if the removeNode is smaller than currenNode, we need to move to the previous
            } else if (comparison > 0) {
                parentNode = currentNode;
                currentNode = currentNode.previous();
            } else {
                //comparison = 0.  It's a match.  We can remove it.
                performRemoval(currentNode, parentNode);
                return true;
            }
        }

        return false;
    }

    //I CANNOT FOLLOW THE INSTRUCTOR'S ANSWER AT ALL.  HIS EXPLANATION IS CONFUSING
    //I tried my own way, but the last part is confusing
    //INCOMPLETE
    public void performRemoval(ListItem removalNode, ListItem parentNode) {
        //if the node we want to remove doesn't have a left or right node, it's easy to remove
        if (removalNode.next() == null && removalNode.previous() == null) {
            if (parentNode.previous() == removalNode) {
                //if the removal node is the parentNode.previous, then remove the parent's previous node
                parentNode.setPrevious(null);
            }
            if (parentNode.next() == removalNode) {
                //if the removal node is the parentNode.next, then remove the parent's next node
                parentNode.setNext(null);
            }
            //if the node we want to remove has a right node, but no left node, we have to reconnect the parent to the only child node
        } else if (removalNode.next() != null && removalNode.previous() == null) {
            if (parentNode.previous() == removalNode) {
                //if the removal node is the parentNode.previous, then remove the parent's previous node
                parentNode.setPrevious(removalNode.next());
            }
            if (parentNode.next() == removalNode) {
                //if the removal node is the parentNode.next, then remove the parent's next node
                parentNode.setNext(removalNode.next());
            }
            //if the node we want to remove has a left node, but no right node, we have to reconnect the parent to the only child node
        } else if (removalNode.next() == null && removalNode.previous() != null) {
            if (parentNode.previous() == removalNode) {
                //if the removal node is the parentNode.previous, then remove the parent's previous node
                parentNode.setPrevious(removalNode.previous());
            }
            if (parentNode.next() == removalNode) {
                //if the removal node is the parentNode.next, then remove the parent's next node
                parentNode.setNext(removalNode.previous());
            }
            //if the node we want to remove has a left node and a right node, we have to reconnect the parent to both child nodes
            //this is complicated since it's a binary search tree.  The parent node can't have 3 branches only two
            //right node would need to become the bigger node with the left node as its child
        } else if (removalNode.next() != null && removalNode.previous != null) {
            //if the removal node is the parentNode.previous, then remove the parent's previous node
            if (parentNode.previous() == removalNode) {
                parentNode.setPrevious(removalNode.next());
                removalNode.next().setPrevious(removalNode.previous());
            }
            //if the removal node is the parentNode.next, then remove the parent's next node
            if (parentNode.next() == removalNode) {
                parentNode.setNext(removalNode.previous());
            }

        }
    }
    
    //RECURSIVE METHOD!!
    //it will travel to the leftmost node until it reaches null and print the leftmost node
    //it will travel back to the current node and print the current node
    //then it will travel to the right node and repeat the process
    //until it prints the entire tree
    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
