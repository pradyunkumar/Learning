package pradyunjava;

public class Printer {

    private int tonerLevel;
    private int numPagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;   //invalid
        }
        this.numPagePrinted = 0;
        this.duplex = duplex;
    }

    public int fillToner(int tonerAmount){
        if(tonerAmount > 0 && (tonerAmount + tonerLevel <= 100)) {
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int Print(int pages){
        if(pages < 0){
            return -1;
        }
        if(duplex){
            if(pages % 2 == 1) {
                pages++;
            }
            pages /= 2;
            System.out.println("Printing in duplex mode");
        } else {
            System.out.println("Printing in regular mode");
        }
        this.numPagePrinted += pages;
        return this.numPagePrinted;
    }

    public int getNumPagePrinted() {
        return numPagePrinted;
    }
}
