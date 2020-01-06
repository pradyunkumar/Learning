import java.util.Scanner;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    //final is constant and the value can never be changed

    public static void main(String[] args) {
        while(true) {   //continuous loop forever, will not exit
            Scanner sc = new Scanner(System.in);    //Scanner
            int i = sc.nextInt();   //gets scanner input
            System.out.println(getDurationString(i));
        }
    }

    private static String getDurationString(int minutes, int seconds){
        String answer;
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }else {
            int hours = minutes / 60;
            int leftminutes = minutes % 60;

            String hoursString = hours + "h ";
            String minutesString = leftminutes + "m ";
            String secondsString = seconds + "s ";
            if(hours < 10 && hours != 0){
                hoursString = "0" + hoursString;
            }if(leftminutes < 10){
                minutesString = "0" + minutesString;
            }if(seconds < 10){
                secondsString = "0" + secondsString;
            }
            answer = hoursString + minutesString + secondsString;
        }
        return answer;
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            int minutes = seconds / 60;
            int leftseconds = seconds % 60;
            return getDurationString(minutes, leftseconds);
        }
    }
}
