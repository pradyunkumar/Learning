import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while(count < 10){
            int order = count + 1;
            System.out.println("Please enter #" + order + ": ");
            boolean works = scanner.hasNextInt();
            if(works) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //after else statement so the invalid content is not stored
        }
        System.out.println("The sum was " + sum);
        scanner.close();
    }
}
