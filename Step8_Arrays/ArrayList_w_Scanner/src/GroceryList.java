import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your shopping list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

//    public void modifyGroceryItem(String newItem) {
//        int itemIndex = groceryList.indexOf((newItem));
//
//    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String removedItem = groceryList.get(position);

        groceryList.remove(position);
        System.out.println("You removed " + removedItem + " from your list");
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}
