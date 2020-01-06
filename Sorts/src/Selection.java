public class Selection {
    /**
     * sorts into partition of sorted and unsorted
     * traverses array to find min/max and replaces it with first/last in unsorted array
     * selects the largest/smallest element and replaces
     * In-place algorithm
     * O(n^2)time complexity --quadratic
     * doesn't require as much swapping as bubble sort
     * unstable algorithm
     * performs same number of comparisons in any case
     */
    public static void selection(int[] arr){
        for(int lastUnsortedIndex = arr.length -1;
                lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(arr[i] > arr[largest])
                    largest = i;
            }

            swap(arr, largest, lastUnsortedIndex);
        }
    }

    public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");

        }
    }

    public static void swap(int[] arr, int i, int j){
        if(i == j)
            return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
