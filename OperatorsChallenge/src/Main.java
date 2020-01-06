public class Main {

    public static void main(String[] args) {

        double a = 20;
        double b = 80;
        double result = a + b;
        System.out.println("Result = " + result);

        result *= 25;
        System.out.println("Result = " + result);

        result %= 40;
        System.out.println("Result = " + result);

        if(result <= 20)
            System.out.println("Total was over the limit");
        else
            System.out.println("oof");
    }
}
