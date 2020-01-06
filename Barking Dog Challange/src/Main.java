public class Main {

    public static void main(String[] args) {
	    bark(true, 1);
    }

    public static boolean bark(boolean barking, int hourofDay){
        boolean answer;
        if(barking && ((hourofDay < 8 && hourofDay >= 0)|| (hourofDay < 24 && hourofDay > 22))){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
