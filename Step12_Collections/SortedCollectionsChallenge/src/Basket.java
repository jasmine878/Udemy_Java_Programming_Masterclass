import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

//create a basket for each unique customer
//each customer will have their own set of stockItems
//the StockItem is the key to our Map, with the quantity as the value
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {

            //if we don't already have the item in our basket then the qty in our basket should be zero
            int qtyInBasket = list.getOrDefault(item, 0);

            list.put(item, qtyInBasket + quantity);

            return qtyInBasket;
        }

        return 0;
    }

    //gets the items from our HashMap
    public Map<StockItem, Integer> getItems() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String stockList = "\nShopping Basket " + name + " contains " + list.size() + (list.size() == 1 ? " item" : " items") + "\n";
        double totalCost = 0.0;

        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            stockList = stockList + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }

        return stockList + "Total cost " + totalCost;
    }
}
