package pradyunjava;

public class Main {
    /*  Inheritance is expanding on a particular object, specifying
    *   Composition is using other methods as part of another
    *       PC has these things
    *
     */
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20 , 5);
        Case theCase = new Case("220B", "Dell",
                "240", dimensions);

        Monitor theMonitor = new Monitor("21inch Beast", "Acer",
                21, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("83-200",
                "Asus",4,6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        //way to call a method in a composite class
//
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }
    //composition is essentially createing objects within objects
}
