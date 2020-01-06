public class Merge {
    /**
     * divide and conquer algorithm
     * recursive
     * two phases: splitting and merging
     *      merging is sorting
     *      splitting phase speeds up merging
     *          does not create new arrays, keeps indexes
     *  not in-lace
     * O(nlogn base 2) run time
     * stable algorithm
     *
     * Splitting Phase
     *  divides array in half(left and right)
     *  keep splitting those arrays into 2
     *  until an array is just a bunch of 1 element arrays
     *
     * Merge Phase
     *  merge every left/right pair of sibling arrays into a sorted array
     *  after 1st merge, there are a bunch of 2-element arrays
     *  then merge these 2-element arrays to make 4-element arrays
     *  repeat until there is a single sorted array
     *  Not in-place. Uses temp arrays
     *  temp array is created to be large enough to hold all elements being merged
     *
     */
    public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void partition(int[] arr, int start, int end){
        if(end - start < 2)
            return;

        int mid = (start + end)/2;
        partition(arr, start, mid);
        partition(arr, mid, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        if(arr[mid -1] <= arr[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end)
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];

        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }
}
