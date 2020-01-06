package pradyunjava;

public class MultPractice implements StudyPractice {
    private int firstint;
    private int secondint;

    public MultPractice(int first, int second){
        firstint = first;
        secondint = second;
    }

    @Override
    public String getProblem() {
        return firstint + " TIMES" + secondint;
    }

    @Override
    public void nextProblem() {
        secondint++;
    }
}
