public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
        //input the values of those parameters into the command to be used in the method
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {   //new method to do same thing
        //put paramaters in so you can use this method twice
        if(gameOver){
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 1000;
            System.out.println("Final Score was " + finalscore);
            return finalscore;  //remove void to data type(int) and put return
        }
        return -1;  //there always needs to be something to be returned, ALWAYS
    }   //-1 means there is an error
}
