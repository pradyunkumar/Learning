/**
 * partitions array into a sorted and unsorted part
 *      sorts left to right
 * sorts by comparing 2 consecutive elements and iterating
 * In-place algorithm
 *      does not create a second array
 *      extra memory needed does not depend on number of elements
 *      O(n^2) time complexity with quadratic

 */
public class Bubble {

    public static void main(String[] args){

    }

    public static void bubble(int[] arr){
        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0;
                lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(arr[i] > arr[i+1])
                    swap(arr, i, i+1);
            }
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
