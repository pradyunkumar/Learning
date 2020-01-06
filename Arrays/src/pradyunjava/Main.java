package pradyunjava;

import java.util.Scanner;

public class Main {
    //arrays are a way to store multiple values of one type
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//	    //works with all primitive types and Strings
//        int[] myIntArray = new int[10];
//        //number in brackets is number of values/spots stored in array, 10
//        myIntArray[5] = 50; //put value 50 into the 5 place of the array
//        //actually the 6th value because counter starts at 0, (ends at 9)
//        System.out.println(myIntArray[5]);
//
//        int[] myIntAArray = {1,2,3,4,5,6,7,8,9,10};
//// automatically assigned 10 from counting
//// myIntArray = {1,2,3,4,5,6,7,8,9,10}; values like so must be assigned with declaration
//
//        //great way to initialize if you have a formula to name values in an array
//        for(int i = 0; i < myIntArray.length; i++){
//            myIntArray[i] = i *10;
//        }
//        for(int i = 0; i < myIntArray.length; i++){
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }
        int[] myInts = getIntegers(5);
        int sum = 0;
        for(int i = 0; i < myInts.length; i++){
            System.out.println("Element " + i + ", typed values was " + myInts[i]);
            sum += myInts[i];
        }
        System.out.println("The sum of all inputed numbers was " + sum);
        System.out.println("The average was " + getAverage(myInts));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        // .\r means skip a line which means that values will be inputed on new lines
        int[] values = new int[number];

        for(int i = 0;i < values.length; i++){
            values[i] = scanner.nextInt();
            //stores value into scanner
        }
        return values;
    }

    public static double getAverage(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double)(sum / array.length);
    }
    private static int[] baseData = new int[10];

    private static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];
        for(int i = 0; i < original.length; i++){
            baseData[i] = original[i];
        }
    }
}

/*  arrays allow to sotre multiple values to a same type into a single variable
*       default values of arrays = 0
*       zero indexed, n elements, range is 0 to n-1
*       index out of range will make an ArrayIndexOutofBoundsException
*       we use square braces to find specific places in an array
*       new operator creates a new array
*       boolean arrays preset to false
*       String arrays preset to null
*/
