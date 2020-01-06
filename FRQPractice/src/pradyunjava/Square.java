
package pradyunjava;

public class Square {
    private boolean isBlack;
    private int num;

    public Square(boolean isBlack, int num){
        this.isBlack = isBlack;
        this.num = num;
    }
}

class Crossword {
    /**
     * Constuctor:
     *  for each Square in 2D array
     *      set isBlack to corrsponding blackSquares value
     *      num = i in loop
     */
    private Square[][] puzzle;

    public Crossword(boolean[][] blackSquares){
        puzzle = new Square[blackSquares.length][blackSquares[0].length];
        int num = 1;
        for(int r = 0; r < blackSquares.length; r++){
            for(int c = 0; c < blackSquares[r].length; c++){
                if(toBeLabeled(r, c, blackSquares)){
                    puzzle[r][c] = new Square(blackSquares[r][c], num);
                    num++;
                } else {
                    puzzle[r][c] = new Square(blackSquares[r][c], 0);
                }
            }
        }
    }

    public boolean toBeLabeled(int r, int c, boolean[][] blackSquares){
        if(!blackSquares[r][c]){
            return (blackSquares[r - 1][c] || blackSquares[r][c - 1] ||
                    r == 0 || c == 0);
        }
        return false;
    }
}
