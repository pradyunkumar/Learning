public class Insertion {
    /**
     * partitions to sorted and unsorted
     * the sorted partition grows while unsorted declines
     * insertion is done through comparing with sorted partition
     *      if value is <= a point, stop and insert there
     * in-place algorithm
     * On^2 time complexity -- quadratic
     * stable algorithm
     * worst case is that the array is in reversse order,
     * leading to max comparisons and moces
     * best case is that array is sorted
     */

    public static void insertion(int[] arr) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length;
                firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            int i = firstUnsortedIndex;
            while(i > 0 && arr[i-1] > newElement){
                arr[i] = arr[i - 1];
                i--;
            }

            arr[i] = newElement;
        }
    }

    public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
