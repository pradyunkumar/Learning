public class Main {

    static final String INVALID = "Invalid Day";
    public static void main(String[] args) {

//        printDayOfTheWeek(2);
        System.out.println(getDaysInMonth(1, 2020));
    }

    public static void printDayOfTheWeek(int day){
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println(INVALID);
                break;
        }
    }



    public static void printNumberInWord(int number){
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;

            case 7:
                System.out.println("SEVEN");
                break;

            case 8:
                System.out.println("EIGHT");
                break;

            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
                break;
        }
    }

// number of days in any month
    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        int numdays;
        if(((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        }else{
            if(isLeapYear(year)) {
                switch (month) {
                    case 4: case 6: case 9: case 11:
                        numdays = 30;
                        break;

                    case 2:
                        numdays = 29;
                        break;

                    default:
                        numdays = 31;
                        break;
                }
            }else{
                switch(month){
                    case 4: case 6: case 9: case 11:
                        numdays = 30;
                        break;

                    case 2:
                        numdays = 28;
                        break;

                    default:
                        numdays = 31;
                        break;

                }
            }
        }
        return numdays;
    }
}
