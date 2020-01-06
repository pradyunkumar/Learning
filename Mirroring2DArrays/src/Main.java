public class Main {

    public static void main(String[] args){
       int[][] arr = {{1,2,3,4},{2,2,3,0},{1,9,2,4}};
       print2DArray(arr);
       matrixMethod(arr);
       System.out.println();
       print2DArray(arr);

    }

    public static void print2DArray(int[][] arr){
        for(int[] row: arr){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void matrixMethod(int[][] mat){
        int height = mat.length;
        int numCols = mat[0].length;
        for(int col = 0; col < numCols/2; col++){
            for(int row = 0; row < height; row++){
                mat[row][numCols - col - 1] = mat[row][col];
            }
        }
    }

}
