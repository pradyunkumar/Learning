package pradyunjava;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    /** Generics are very useful
     *      allow us to make classes, interfaces and methods to use types as params
     *      with generics, object is raw
     */

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n){
        for (int i: n) {
            System.out.println(i * 2);

        }
    }
}
