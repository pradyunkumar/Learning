package pradyunjava;

import pradyunjava.Series;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            if(i == 10)
                System.out.print(Series.nSum(i));
            else
                System.out.print(Series.nSum(i) + ", ");
        }
        System.out.println();
        for(int i = 0; i <= 10; i++){
            if(i == 10)
                System.out.print(Series.factorial(i));
            else
                System.out.print(Series.factorial(i) + ", ");
        }
        System.out.println();
        for(int i = 0; i <= 10; i++){
            if(i == 10)
                System.out.print(Series.fibonacci(i));
            else
                System.out.print(Series.fibonacci(i) + ", ");
        }
    }
}
