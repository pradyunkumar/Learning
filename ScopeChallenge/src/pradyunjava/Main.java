package pradyunjava;

import java.util.Scanner;

public class Main {
    private static final Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" Enter a value of x: ");
        new X(x.nextInt()).x();
    }
}
