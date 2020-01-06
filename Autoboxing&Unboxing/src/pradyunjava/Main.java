package pradyunjava;

import java.util.ArrayList;
/*  lots of lists and classes need classes not primitive type
*   autoboxing allows primitive data types into these lists through autoboxing
*       creates wrapper of type:
*       Integer is int
*       Double is double
*       Character is char
*   autoboxing is converting primitive to its wrapper class
*       int to Integer
*   Unboxing is converting wrapper to primitive typr
*       Integer to int
* */
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Pradyun");

        // ArrayList<int> intArrayList = new ArrayList<int>();
        //ArrayLists require classes and primitive types are not classes

//        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for(int i = 0; i < 10; i++){
//            intArrayList.add(Integer.valueOf(i));
//        }
//
//        for(int i = 0; i < 10; i++){
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }
//
//        Integer myInt = 56;  //Integer.valueOf(56);

        ArrayList<Double> doubles = new ArrayList<Double>();
        for(double i = 0; i <= 10.0; i += 0.5){
            doubles.add(i);
        }

        for(int a = 0; a < doubles.size(); a++){
            double value = doubles.get(a);
            System.out.println(a + " --> " + value);
        }
    }
}
