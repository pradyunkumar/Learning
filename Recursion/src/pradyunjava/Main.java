package pradyunjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

/**
 * Factorial Algorithm
 *      if num == 0, factorial = 1, result is found
 *      set multiplier to 1
 *      set factorial to 1
 *      while multiplier != num do
 *          multiply factorial by multiplier and assign
 *          result to factorial
 *          add 1 to multiplier
 *
 */
    //iterative
    public static int Ifactorial(int num){
        if(num == 0)
            return 1;

        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }

    //recursive
    public static int Rfactorial(int num){
        if(num == 0)
            return 1;

        return num * Rfactorial(num-1);
    }
}
