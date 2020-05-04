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


}
