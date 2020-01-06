package pradyunjava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the number of values in the array: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input " + number + " integer values: ");
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        reverse(array);
    }

    private static void reverse(int[] array){
        int temp;
        int lastrun = (array.length/2);
        for(int i = 0; i < lastrun; i++){
            temp = array[i];
            array[i] = array[(array.length-1) - i];
            array[(array.length-1) - i] = temp;
        }
        System.out.println("Reversed array is: " + Arrays.toString(array));
    }
}
