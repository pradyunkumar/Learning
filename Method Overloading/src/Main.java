public class Main {
    //method overloading is using the same method name but with different parameters
    //println contains 10 methods!!

    public static void main(String[] args) {
	    int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75); //calls 2nd method because those parameters inputted
        calculateScore();   //no parameters so different method


        //----------Challenge-----------
        System.out.println();
        System.out.println();

        //inches and feet given, 1st method
        calcFeetAndInchesToCentimeters(0, 2);





    }   //uniqueness is determined through data types not names of variables

    public static int calculateScore(String playerName, int score){
        System.out.println("Player" + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){    //different parameters
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){    //different parameters
        System.out.println("Unnamed Player scored ?? points");
        return 0;
    }
//    public static void calculateScore(){    //different parameters
//        System.out.println("Unnamed Player scored ?? points");
//        //data type of method does not change the method's signature
//    }   //PARAMETERS must be changed for uniqueness

    //----------Challenge------------

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double cm;
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            cm = ((12 * feet) + inches) * 2.54;
            System.out.println("This length is " + cm + " cm");
        } else {
            return -1;  //error
        }
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet;
        if(inches < 0) {
            return -1;  //error
        }
        feet = (int) inches / 12;   //cast int to avoid dealing with remainders
        double newinches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, newinches);
    }   //you can return a value and call a method at the same time

}


