//THIS IS AN INTERFACE THAT ANY STRUCTURE USING A NODE OBJECT WILL IMPLEMENT!!

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
