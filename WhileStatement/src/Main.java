public class Main {

    public static void main(String[] args) {
        byte a = 10;
        a = (byte)(a /2);

//        int count = 0;
//        while(count != 6){  //may not get into while loop if condition is not met
//            System.out.println("Count value is " + count);
//            count++;    //need the count
//        }
//
////        for(int i = 0; i < 7; i++){ //for loop is NOT same as while
//////            System.out.println("Count Value is " + count);
//////        }
//        for(count = 0; count != 6; count++) { //use same variable
//            System.out.println("Count Value is " + count);
//        }
//        count = 1;
//        while(true){    //another way to write the while
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count Value is " + count);
//            count++;
//        }
//
//        count = 1;  //restart count
//        //count = 6;  //do while always runs at least once because of counter
//        do {    //always runs at least once
//            System.out.println("Count value was " + count);
//            count ++;
//
////            if(count > 100){    //goes to 100
////                break;
////            }
//        }while(count != 6); //test to see if you should exit do statement

        int n = 4;
        int finishNumber = 20;
        double count = 0;
            while (n <= finishNumber) {
                n++;
                if (!isEvenNumber(n)) {
                    continue;   //continue doesn't do more code, goes back to top
                }
                System.out.println("Even number " + n);
                count++;
                if(count == 5){
                    break;
                }
            }

        System.out.println("# of Even Numbers: " + String.format("%.0f",count));


    }

    public static boolean isEvenNumber(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}
