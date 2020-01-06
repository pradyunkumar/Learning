package pradyunjava;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
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



        Basket pradsBasket = new Basket("Prad");

        reserveItem(pradsBasket, "car", 1);
        reserveItem(pradsBasket, "car", 1);
        reserveItem(pradsBasket, "car", 1);
        reserveItem(pradsBasket, "spanner", 5);
        reserveItem(pradsBasket, "juice", 4);
        reserveItem(pradsBasket, "cup", 12);
        reserveItem(pradsBasket, "bread", 1);
        System.out.println(pradsBasket);

        unreserveItem(pradsBasket, "car", 7);
        unreserveItem(pradsBasket, "towel", 4);
        System.out.println(pradsBasket);

        checkOut(pradsBasket);
        System.out.println(pradsBasket);

        System.out.println(stockList);
    }

    public static int reserveItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(quantity > stockItem.quantityInStock()){
            System.out.println("Sorry, " + quantity + " " + item + "s are not in stock");
        } else {
            return basket.reserve(stockItem, quantity);
        }
        return 0;
    }

    public static int unreserveItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        return basket.unreserve(stockItem, quantity);
    }

    public static void checkOut(Basket basket){
        StockItem item;
        for(Map.Entry<StockItem, Integer> entry: basket.Items().entrySet()){
            item = entry.getKey();
            stockList.sellStock(item.getName(), item.getReserved());
        }
        basket.clearBasket();
    }
}

