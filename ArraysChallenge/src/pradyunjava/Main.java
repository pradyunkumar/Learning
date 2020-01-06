package pradyunjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        getIntegers(5);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Input " + number + " integer values.\r");
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("In place " + i + ", " + array[i] + " was inputted");
        }
    }

    public static int[] sortIntegers(int[] array){
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int thisnum;
        for(int j = 0; j < sortedArray.length; j++) {
            for (int i = 1; i < sortedArray.length; i++) {
                thisnum = sortedArray[i];
                if(thisnum > sortedArray[i-1]) {
                    sortedArray[i] = sortedArray[i-1];
                    sortedArray[i-1] = thisnum;
                }
            }
        }
        return sortedArray;
    }
}
