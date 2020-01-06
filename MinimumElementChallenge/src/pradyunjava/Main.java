package pradyunjava;

import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the # of numbers in the array: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int min = findMin(readIntegers(count));

        System.out.println("The minumum number is " + min);

        scanner.close();
    }

    private static int[] readIntegers(int count){
        System.out.println("Please enter array numbers:");
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
