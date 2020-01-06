public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int leveldone = 5;
        int bonus = 100;

        if(gameOver){ //if is true
            int finascore = score + (leveldone * bonus);
            System.out.println("Final Score is " + finascore);
        } //once code block finishes, variables created inside code block cannot be accessed
//        if (score < 5000) {  //use braces to create a code block
//            System.out.println("Your score was 5000.");
//        }//without braces, only statement after falls under if
//        else if(5000 < score && score < 9000){
//            System.out.println("big oof");
//        }
//        else{
//            System.out.println("oof");
//        }
    }//if there is only one line/statement after the test, braces are not needed
}
