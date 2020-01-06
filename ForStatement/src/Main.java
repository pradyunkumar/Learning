public class Main {

    public static void main(String[] args) {
        System.out.println(calculateInterest(10000, 2));
        for(double i = 9; i > 2; i -= 0.5){ //runs over and over again
            System.out.println("$10000 with a " + i + "% interest = "
                    + String.format("%.1f",calculateInterest(10000, i)));
        }   //String.format("%.-f",---), convert to decimal with 2 decimal points

        System.out.println();
        System.out.println("------------------------");
        System.out.println();

        int count = 0;
        for(int i = 50; i < 70; i ++){
            if(isPrime(i)){
                System.out.print(i + ", ");
                count++;
                if(count == 3){
                    break;
                }
            }
        }


    }
    //  for(init, termination, increment)
    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++){  //square root is more efficient
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }



}
