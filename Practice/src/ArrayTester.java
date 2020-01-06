public class ArrayTester {

    public static void main(String[] args){
//        int[][] arr2D = {{1,2,3,4},
//                        {11,12,3,4},
//                        {1,62,3,4}};
        int[][] arr2D = {{1,2,3,4}};
        int[] arr = getColumn(arr2D,1);
        for (int a : arr) {
            System.out.println(a);
        }

    }
    public static int[] getColumn(int[][] arr2D, int c){
        int column[] = new int[arr2D.length];
        for(int i = 0; i < arr2D.length; i++){
            column[i] = arr2D[i][c-1];
        }
        return column;
    }

    public static boolean hasAllValues(int[] arr1, int [] arr2){
        return true;
    }
    public static boolean containsDuplicates(int[] arr){
        return true;
    }

    public static boolean isLatin(int[][] square){
        return !containsDuplicates(square[1]) && 
    }
}
