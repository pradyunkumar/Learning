import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.in allows input of values into console
        //Scanner is a built in class in java
        //new creates an instance of Scanner, or object of type Scanner

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        //checks to see if input is actually an int, before calling scanner input
        //deals with input mismatch exception

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            //after using Scanner print the next line to prepare Scanner
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();   //takes data
            //nextLine is for strings

            int age = 2018 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Invalid type of data");
        }
        //Scanner is done, we close it
        scanner.close();    //closes scanner
    }
}
