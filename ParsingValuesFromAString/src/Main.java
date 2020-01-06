public class Main {

    public static void main(String[] args) {
        /* parsing a String is converting a String into
           another data type such as an int
           helps for reading user input*/
        String numberAsString = "2018.9";    //has to be int to convert
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        //using Integer Class, wrapper class, containing method parseInt()
        //must parse into primitive type
        System.out.println("number = " + number);

        numberAsString += 1;    //java converts 1 into string -- 20181
        number += 1;    //will be 2019

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
}
