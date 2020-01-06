package pradyunjava;

import java.util.Arrays;

public class Main {
/*  primitive types are value types
*   String and array reference type
*
*   reference types used by reference
*   reference holds address to object but not Object itself
*   variable holds reference to array in memory
*   if one reference changes a object, then the other array reference is also changed in memory
*   if one reference changes an object, the other reference still pointing to that object, changes as well
*
*
*
*/
    public static void main(String[] args){
        int myInt = 10;
        int anotherInt = myInt; //both values same

        int[] myIntarray = new int[5];
        int[] anotherArray = myIntarray;    //another reference to same array in mem

        anotherArray[0] = 1;

        System.out.println("myIntarray = " + Arrays.toString(myIntarray));
        System.out.println("antherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        modifyArray(myIntarray);

        System.out.println("myIntarray after modify = " + Arrays.toString(myIntarray));
        System.out.println("antherArray after modify = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
