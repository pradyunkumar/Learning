public class NumberCode {
    private int[][] numMatrix;

    private int toDigit(String ch){
        return 0;
    }

    private void fillArray(String str){
        int size = 1;
        while(size*size < str.length())
            size++;
        numMatrix = new int[size][size];
        for(int i = 0; i < numMatrix.length; i++){
            for(int j = i; j < numMatrix.length; j++){
                
            }
        }
    }
}
