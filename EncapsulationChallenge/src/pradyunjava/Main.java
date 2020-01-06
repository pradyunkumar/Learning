package pradyunjava;

public class Main {

    public static void main(String[] args) {

        Printer myPrinter = new Printer(45, false);
        int pagesPrinted = myPrinter.Print(12);
        myPrinter.fillToner(20);
        System.out.println("Pages prints was " + pagesPrinted +
                " new total print cout for printer = " + myPrinter.getNumPagePrinted());
    }
}
