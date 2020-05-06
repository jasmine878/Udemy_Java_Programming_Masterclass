import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);

        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.5, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", .50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", .45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String stockItem : stockList.Items().keySet()) {
            System.out.println(stockItem);
        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        //test what happens when inventory doesn't exist
        if (sellItem(timsBasket, "car", 1) < 1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(timsBasket, "spanner", 5);

        sellItem(timsBasket, "juice", 4);
        sellItem(timsBasket, "cup", 12);
        sellItem(timsBasket, "bread", 1);

        Basket basket = new Basket("customer");
        sellItem(basket,"cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(timsBasket, "car", 1);
        removeItem(timsBasket, "cup", 9);
        removeItem(timsBasket, "car", 1);
        System.out.println("cars removed: " + removeItem(timsBasket, "car", 1));    //should not remove any

        System.out.println(timsBasket);

        //remove all items in Tim's basket
        removeItem(timsBasket, "bread", 1);
        removeItem(timsBasket, "cup", 3);
        removeItem(timsBasket, "juice", 4);
        removeItem(timsBasket, "cup", 3);
        System.out.println(timsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkout(basket);
        System.out.println(basket);
        System.out.println(stockList);





        //we can't modify the stockList directly using Items method
        // because Items method uses an unmodifiable List
        //THIS RETURNS AN ERROR!
//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);

        //however, we can still update the individual items in the stockList
//        stockList.Items().get("car").adjustQuantity(2000);
//        stockList.getItem("car").adjustQuantity(-1000);
//        System.out.println(stockList);
//        System.out.println();

        checkout(timsBasket);
        System.out.println(timsBasket);
    }

    //use our reserveStock method in StockList class
    //checks to make sure quantity is in the customer shoppin cart
    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.getItem(item);

        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.reserveStock(item, quantity) != 0) {

            return basket.addToBasket(stockItem, quantity);
        }

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.getItem(item);

        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            System.out.println("REMOVED: " + item + ", " + quantity);
            return stockList.unreserveStock(item, quantity);
        }

        return 0;
    }

    public static void checkout(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.getItems().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
