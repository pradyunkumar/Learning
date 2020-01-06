package pradyunjava;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;

    public SparseArray(){
        entries = new ArrayList<>();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    /**
     * @param row
     * @param col
     *  for each value in the List
     *      if entry column == col && entry row == row
     *          return entry value
     *      else return 0
     * @return
     */

    public int getValueAt(int row, int col){
        for(SparseArrayEntry entry: entries){
            if(entry.getCol() == col && entry.getRow() == row){
                return entry.getValue();
            }
        }
        return 0;
    }

    /**
     * @param col
     * for each entry
     *  if entry.getCol == col, remove from list
     *  if entry.getCol > col
     *      new Entry(same row, same value, col -1)
     */

    public void removeColumn(int col){
        for(SparseArrayEntry entry: entries){
            if(entry.getCol() == col){
                entries.remove(entry);
            }
            if(entry.getCol() > col){
                entries.add(new SparseArrayEntry(entry.getCol()-1,
                        entry.getRow(), entry.getValue()));
                entries.remove(entry);
            }
        }
        numCols--;
    }
}

class SparseArrayEntry{
    private int col;
    private int row;
    private int value;

    public SparseArrayEntry(int c, int r, int v){
        col = c;
        row = r;
        value = v;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }
}