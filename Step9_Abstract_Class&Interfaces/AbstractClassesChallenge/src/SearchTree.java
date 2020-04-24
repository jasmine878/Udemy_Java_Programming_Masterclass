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
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
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
