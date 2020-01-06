import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;    //using property of int, min can be 2147483647
        int max = Integer.MIN_VALUE;    //using property of int, max can be -2147483648
//        boolean first = true;   //flag that only runs once, storing first value
        //with constants in Integer class you can use min and max values set constants

        while(true){
            System.out.println("Enter number: ");
            boolean works = scanner.hasNextInt();

            if(works){
                int number = scanner.nextInt();

//                if(first){
//                    first = false;  //after first run, variable won't be true anymore
//                    min = number;
//                    max = number;
//                }
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
                scanner.nextLine();
            }else{
                break;
            }
        }

        System.out.println("The minimum is " + min
            + " and the maximum is " + max);
        scanner.close();
    }
}
