package pradyunjava;

import java.util.ArrayList;

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
        int product = 1;
        if(n <0){
            System.out.println("Value 'n' cannot be negative.");
            System.exit(0);
        } else if(n==0){
            product = 0;
        }
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
        ArrayList<Integer> Sequence = new ArrayList<Integer>();
        Sequence.add(0,0);
        Sequence.add(1,1);
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        } else {
            for(int i = 2; i <= n; i++){
                Sequence.add(i,Sequence.get(i-1) + Sequence.get(i-2));
                if(i==n){
                    return Sequence.get(n);
                }
            }
        }
        return -1;
    }
}
