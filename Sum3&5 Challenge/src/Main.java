public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;

                if (count < 5) {
                    System.out.print(i + ", ");
                }else{
                    System.out.println("and " + i);
                    System.out.println("The sum is " + sum);
                    break;
                }

            }
        }
    }

    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        if(number % 2 == 1){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((end < start) || (start < 0 || end < 0)){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
