public class Main {

    public static void main(String[] args) {
//        boolean yes = areEqualByThreeDecimalPlaces(3.175,  3.176);
//        System.out.println(yes);
//	int position = calculateHighScorePosition(1500);
//	displayHighScorePosition("Bob", position);
//
//	position = calculateHighScorePosition(900);
//	displayHighScorePosition("Mary", position);
//
//	position = calculateHighScorePosition(400);
//	displayHighScorePosition("Nick", position);
//
//	position = calculateHighScorePosition(50);
//	displayHighScorePosition("Jack", position);
//    }
//
//    public static void displayHighScorePosition(String PlayerName, int position){
//        System.out.println(PlayerName + " managed to get into position " + position
//        + " on the high score table.");
//    }   //void method can be called a procedure, and method can be called function
//
//    public static int calculateHighScorePosition(int playerscore){
//        int position;   //initialize variable and use for if-else
//        if(playerscore >= 1000){
//            position = 1;
//        }
//        else if(playerscore >= 500){
//            position = 2;
//        }
//        else if(playerscore >= 100){
//            position = 3;
//        }else{
//            position = 4;
       }
//        return position;    //easier to read, should be one return statement









    //Main method

//    public static boolean isLeapYear(int year){
//        boolean answer = false;
//        if(year >= 1 || year <= 9999){
//            if(year % 4 == 0 && year % 100 != 0){
//                answer = true;
//            }
//        }else{
//            answer = false;
//        }
//        return answer;
//    }
//    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2)
//    {
//        int a=(int) (number1*1000);
//        int b=(int) (number2*1000);
//        if(a==b)
//            return true;
//        else
//            return false;
//        public static boolean hasEqualSum(int num1, int num2, int sum){
//        boolean response;
//        if(num1 + num2 == sum){
//            response = true;
//        }else{
//            response = false;
//        }
//        return response;
//    }
    public static boolean hasTeen(int one, int two, int three){
        boolean response;
        if((one >= 13 && one <= 19) || (two >= 13 && two <= 19) || (three >= 13 && three <= 19)){
            response = true;
        }else{
            response = false;
        }
        return response;
    }
}
