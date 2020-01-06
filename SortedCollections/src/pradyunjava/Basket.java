package pradyunjava;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    private int reservation(StockItem item, int quantity) {
        if (item != null) {
            item.reserve(quantity);
            list.put(item, item.getReserved());
            return list.getOrDefault(item, 0);
        }
        return 0;
    }

    public int reserve(StockItem item, int quantity) {
        if(quantity > 0) {
            if ((item.quantityInStock()-item.getReserved()) < quantity) {
                System.out.println("Sorry, we don't have " +
                        quantity + " "+ item.getName() + "s in stock.");
            } else {
                int inBasket = reservation(item, quantity);
                if (inBasket != 0) {
                    list.put(item, inBasket + quantity);
                    return inBasket;
                }
            }
        }
        return 0;
    }

    public int unreserve(StockItem item , int quantity){
        int reserved = item.getReserved();
        if(quantity > 0) {
            if (!list.containsKey(item)){
                System.out.println("Sorry, " + item.getName() + "s are not " +
                        "in the basket.");
            } else if (quantity > reserved) {
                System.out.println("Sorry, you have only reserved " +
                        reserved + " " + item.getName() + "s.");
            } else {
                int inBasket = reservation(item, -quantity);
                list.put(item, inBasket - quantity);
            }
            return reserved;
        }

        return 0;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    public void clearBasket(){
        list.clear();
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getKey().getReserved() + " reserved\n";
            totalCost += item.getKey().getPrice() * item.getKey().getReserved();
        }
        return s + "Total cost $" + String.format("%.2f",totalCost);
    }
}
