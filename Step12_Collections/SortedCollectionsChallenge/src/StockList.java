import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

//this class holds a list of all the stock items in a map
//it has methods to add stock to the list and
//remove items when they are sold
public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        list = new LinkedHashMap<>();
    }

    //gets the Item from our HashMap
    public StockItem getItem(String key) {
        return list.get(key);
    }

    //returns our HashMap which is unmodifiable
    //only the list itself is unmodifiable and will generate an error
    //However, we can still access the individual items in the list and then modify them
    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    //here we're adding double protection
    //first we're creating another LinkedHashMap
    //and we're making it an unmodifiable map
    //if someone modifies the individual items, the original LinkedHashMap will not be affected
    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();

        for (Map.Entry<String, StockItem> item: list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }

        return Collections.unmodifiableMap(prices);
    }

    public int addStock(StockItem item) {
        if (item != null) {
            //we're using the item name for our key in our map
            //if we find an existing item in our list assign it to inStock
            //if not, assign inStock to our parameter item which is our default
            StockItem inStock = list.getOrDefault(item.getName(), item);

            //if the item exists add our existing quantity to our item qty
            if (inStock != item) item.adjustQuantity(inStock.availableQuantity());

            //we're adding the item to our inventory
            //with an existing item, we're updating the quantity that exists first
            //this duplicate entry will replace the original map item and in effect update it
            //if it's a new item, we're simply adding it to our map
            list.put(item.getName(), item);

            //then we're returning the updated quantity of the item
            return item.availableQuantity();
        }

        return 0;
    }

    //with the customer checkout use the item from our LinkedHashMap to checkout
    public int sellStock(String item, int quantity) {
        //we can't sell something that's not in stock.  Assuming we will always get the item inStock
        //otherwise, our item is set to null for default
//        StockItem inStock = list.getOrDefault(item, null);
//
//        if (inStock != null && inStock.availableQuantity() >= quantity && quantity > 0) {
//            //we're deducting the quantity from our stock
//            inStock.adjustQuantity(-quantity);
//
//            return quantity;
//        }
//
//        return 0;

        StockItem inStock = list.get(item);

        if (inStock != null && quantity > 0) {
            return inStock.finalizeStock(quantity);
        }

        return 0;
    }

    //grabs the item from our LinkedHashMap and puts the quantity in our Shopping Cart
    public int reserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if(inStock != null && quantity > 0) {
            return inStock.reserveStock(quantity);
        }

        return 0;
    }

    public int unreserveStock(String item, int quantity) {
        StockItem inStock = list.get(item);

        if (inStock != null & quantity > 0) {
            return inStock.unreserveStock(quantity);
        }

        return 0;
    }

    //this method is confusing and convoluted
    //we're printing our Stock List HashMap
    //it's returning a list of all of the items in list
    @Override
    public String toString() {
        String stockList = "\nStock List\n";
        double totalCost = 0.0;

        //Map.Entry interface provides certain methods to access the entry in the Map
        //By gaining access to the entry of the Map we can easily manipulate them
        //Map.Entry is a generic and is defined in the java.util package
        //.entrySet returns a Set containing the Map.Entry values
        for (Map.Entry<String, StockItem> item : list.entrySet()) {         //we're iterating through the entire Map
            //.getValue returns the value of the corresponding map entry
            StockItem stockItem = item.getValue();                          //returns a single stock item

            //determine the item value
            double itemValue = stockItem.getPrice() * stockItem.availableQuantity();

            stockList = stockList + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: ";
            stockList = stockList + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }

        return stockList + "Total stock value " + totalCost;
    }
}
