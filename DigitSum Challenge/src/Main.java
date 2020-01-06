public class Main {

    public static void main(String[] args) {

        //numberToWords(401);
        numberToWords(400);

    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        while (number != 0) {
            int remainder = number % 10;
            switch (remainder) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            number /= 10;
        }
        int difference = getDigitCount(number) - getDigitCount(reverse(number));
        for (int i = 0; i < difference;i++){
            System.out.println("Zero ");
        }
    }

    public static int reverse(int number){
        int reversed = 0;
        while(number != 0){
            int lastdigit = number % 10;
            reversed = (reversed * 10) + lastdigit;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number){
        int count = 0;
        if(number < 0){
            return -1;
        }
        while(number >= 0){
            number /= 10;
            count++;
        }
        return count;
    }
//    private static int sumDigits(int number){
//        int sumnum = 0;
//        int remainder;
//        while(number > 10){
//            remainder = number % 10;
//            sumnum += remainder;
//            number /= 10;
//            if(number < 10){
//                sumnum += number;
//            }
//            while(remainder == 0){
//                remainder = number % 10;
//                number /= 10;
//                sumnum += remainder;
//            }
//        }
//        if(number < 10){
//            return -1;
//        }
//        return sumnum;
//    }


/*


    public static boolean isPalindrome(int number){
        int reverse = 0;    //initialize variable reverse
        int fixednum = number;  //fixed number to compare
        while(number != 0) {
            int lastdigit = number % 10;    //ones digit
            reverse = (reverse * 10) + lastdigit;   //next place value input digit
            number /= 10;   //get rid of used place value
        }
        if(fixednum == reverse){
            return true;
        }
        return false;
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastdigit = number % 10;
        while(number >= 10){
            number /= 10;
        }
        number += lastdigit;
        return number;
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            int remainder = number % 10;
            if (remainder % 2 == 0){
                sum += remainder;
            }
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)){
            return false;
        }
        int remainder1 = num1 % 10;
        int remainder2 = num2 % 10;
        if(remainder1 == remainder2){
            return true;
        }
        num1 /= 10;
        num2 /= 10;
        if((num1 == remainder2) || (num1 == num2) || (num2 == remainder1)){
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000
                || num3 < 10 || num3 > 1000){
            return false;
        }
        int r1 = num1 % 10;
        int r2 = num2 % 10;
        int r3 = num3 % 10;
        if((r1 == r2) || (r2 == r3) || (r1 == r3)){
            return true;
        }
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int response = 0;
        if(first < 10 || second < 10){
            return -1;
        }
        if(first < second){
            for(int i = 1; i <= first; i++){
                if(first % i == 0 && second % i == 0){
                    response = i;
                }
            }
        } else if(second < first) {
            for (int i = 1; i <= second; i++) {
                if (first % i == 0 && second % i == 0) {
                    response = i;
                }
            }
        }
        return response;
    }

    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        if(number < 1){
            return false;
        }
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            return true;
        }
        return false;
    }
*/


}
