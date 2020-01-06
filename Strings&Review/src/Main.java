public class Main {

    public static void main(String[] args) {
	/* primitive data types: defined by the java language, and is
	                         named by a special keyword, built-in
	    -byte, short, int, long, float, double, char, boolean
	    Objects: new data types you can create      */
	    //string can carry many characters, and is a class not a data type

        String theString = "This is a String ";  //multiple characters
        System.out.println(theString);
        theString = theString + "and more.";    //add more to it
        System.out.println(theString);          //new print will show additions
        theString = theString + " \u00A9 2018"; //add unicode
        System.out.println(theString);
        //strings don't do calculations, doesn't support numeric calculations
        //it will treat numbers as text

        String newString = "10";
        int theINt = 40;
        newString = newString + theINt;
        System.out.println(newString);      //int is converted to String
        //any number data type will be converted to string
    }
}
