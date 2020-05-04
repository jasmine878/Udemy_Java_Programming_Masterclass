import java.util.HashMap;
import java.util.Map;

//create a basket for each unique customer
//each customer will have their own set of stockItems
//the StockItem is the key to our Map, with the quantity as the value
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        list = new HashMap<>();
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
}
