public class Main {

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5,6));

        //NEW----CHALLENGE---
        printYearsAndDays(525600);


        //NEW----CHALLENGE---

    }

    private static final double PI = 3.14159;
    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        else{
            double area = radius * radius * PI;
            return area;
        }
    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            return -1;
        }
        else{
            double area = x * y;
            return area;
        }
    }



    //NEW----CHALLENGE---
    //private static final String INVALID_VALUE = "Invalid Value";
    private static final long theyear = 525600;
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println(INVALID_VALUE);
        }
        else{
            long year = (minutes / theyear);
            long newdays = (minutes % theyear) / 1440;
            System.out.println(minutes + " min = " + year + " y and " + newdays + " d");
        }
    }

    //NEW----CHALLENGE---
    private static final String INVALID_VALUE = "Invalid Value";
    public static void printEqual(int a, int b, int c){
        if((a < 0) || (b < 0) || (c < 0)){
            System.out.println(INVALID_VALUE);
        }
        else if((a == b) && (b == c)){
            System.out.println("All numbers are equal");
        }
        else if((a != b) && (b != c) && (a != c)){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }



    //NEW----CHALLENGE---
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean answer;
        if(summer){
            if(temperature >= 25 && temperature <= 45){
                answer = true;
            }else{
                answer = false;
            }
        } else{
             if(temperature >= 25 && temperature <= 35){
                 answer = true;
             }else {
                 answer = false;
             }
        }
        return answer;
    }





}
