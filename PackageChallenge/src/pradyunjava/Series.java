package pradyunjava;

public class Series {

    public static int nSum(int n){
        if(n <0){
            System.out.println("Value 'n' cannot be negative.");
            System.exit(0);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (n - i);
        }
        return sum;
    }

    public static int factorial(int n){
        if(n <0){
            System.out.println("Value 'n' cannot be negative.");
            System.exit(0);
        }
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= (n - i);
        }
        return product;
    }

    public static int fibonacci(int n){
        if(n <0){
            System.out.println("Value 'n' cannot be negative.");
            System.exit(0);
        }
        int temp;
        int num = 0;
        boolean flag = false;
        for(int i = 0; i < n; i++){
            temp = num;
            if(!flag){
                num = 1;
                flag = true;
            }
            num += temp;
        }
        return num;
    }
}
