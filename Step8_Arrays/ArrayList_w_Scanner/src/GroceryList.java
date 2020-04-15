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

    public void modifyGroceryItem(String newItem) {
        int itemIndex = groceryList.indexOf(newItem);

        if (itemIndex >= 0) modifyGroceryItem(itemIndex, newItem);
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String removedItem) {
        int itemIndex = groceryList.indexOf(removedItem);

        if (itemIndex >= 0) {
            groceryList.remove(itemIndex);
            System.out.println("You removed " + removedItem + " from your list");
        } else {
            System.out.println(removedItem + " is not in the grocery list.  Unable to remove");
        }

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
