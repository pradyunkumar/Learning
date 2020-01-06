public class NumChallenge {

    public static void main(String[] args){

        byte thebyte = 30;
        short theshort = 1000;
        int theint = 2500;
        long thefinal = (long)(50000 + (10 * (thebyte + theshort + theint)));
        //no need for casting because all data types can be long
        System.out.println("The sum is " + thefinal);
    }
}
