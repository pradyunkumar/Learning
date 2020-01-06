package pradyunjava;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer");
        String input = s.next();
        for(int i = 0; i < input.length(); i++){
            if(!Character.isDigit(input.charAt(i)))
                isValid = false;
                break;
        }
        if(isValid)
            return Integer.parseInt(input);
        return 0;
    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        try{
            return s.nextInt();
        } catch(InputMismatchException | IllegalAccessError e){
            throw new InputMismatchException("Wrong data");
        }
    }

    private static int divideLBYL(int x, int y){
        if(y != 0)
            return x/y;
        else
            return 0;
    }

    private static int divideEAFP(int x, int y){
        try {
            return x/y;
        } catch(ArithmeticException E) {
            return 0;
        }
    }
}
