import java.util.HashMap;
import java.util.Map;

//this class holds a list of all the stock items in a map
//it has methods to add stock to the list and
//remove items when they are sold
public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        list = new HashMap<>();
    }
}
