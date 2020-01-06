public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        //assigned returned value from method to a new variable
        System.out.println("Final Score was " + highScore);

        score = 10000;  //new values assigned
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        //assigned returned value from method to a new variable
        System.out.println("Final Score was " + highScore);

        calculateScore(gameOver, score, levelCompleted, bonus);
        //input the values of those parameters into the command to be used in the method
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {   //new method to do same thing
        //put paramaters in so you can use this method twice
        if(gameOver){
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 1000;
            //System.out.println("Final Score was " + finalscore); (no need)
            return finalscore;  //remove void to data type(int) and put return
        }
        return -1;  //there always needs to be something to be returned, ALWAYS
    }   //-1 means there is an error
}
