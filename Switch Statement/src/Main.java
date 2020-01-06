public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Not 1 or 2");
        }

        /* when you have more values to test or any more conditions,
           you use switch   */
        //do this same thing as above using switch

        int switchValue = 1;
        switch (switchValue) {  //only tests primitive data types, not String
            case 1: //first case or "if", testing if it is 1
                System.out.println("Value was 1");  //do if
                break;  //terminates this switch statement

            case 2: //another case, testing int 2
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5: //multiple cases at once
                System.out.println("Was a 3, 4 , or 5");
                break;  //without break, results are unpredictable

            default:    //like an else statement, if none above works, do this
                System.out.println("Was not 1 or 2");
                break;  //not really needed as is last statement

        }

            //--------------Challenge-----------
        char bruh = 'A';
        switch(bruh){
//            case 'A':
//                System.out.println("Found A");
//                break;
//
//            case 'B':
//                System.out.println("Found B");
//                break;
//
//            case 'C':
//                System.out.println("Found C");
//                break;
//
//            case 'D':
//                System.out.println("Found D");
//                break;
//
//            case 'E':
//                System.out.println("Found E");
//                break;
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(bruh + " was found");
                break;  //more efficient

            default:
                System.out.println("Not Found");
                break;
        }

        String month = "Jan";   //works past JDK 7
        switch(month.toLowerCase()){
            //toLowerCase() is a method in String Class that converts to lowercase
            //toUpperCase() works the same way (upper case)
            case("jan"):    //must be lower case after toLowerCase()
                System.out.println("It's January");
                break;

            case("june"):
                System.out.println("It's June");
                break;

            default:
                System.out.println("Not Sure");
                break;
        }





        /*  break means more code here, outside of switch code blocks
        *   if statement is more flexible, test criteria can be different
        *   switch can only test one variable, so different values for that variable*/

    }

}
