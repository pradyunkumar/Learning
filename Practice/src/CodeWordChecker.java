public class CodeWordChecker implements StringChecker {

    private int min;
    private int max;
    private String wrong;

    public CodeWordChecker(String word){
        min = 6;
        max = 20;
        wrong = word;
    }
    public CodeWordChecker(int min, int max, String word){
        this.min = min;
        this.max = max;
        wrong = word;
    }
    @Override
    public boolean isValid(String str) {
        if(str.length() < min || str.length() > max){
            return false;
        } else if (!str.contains(wrong)){
            return false;
        } else {
            return true;
        }
    }
}
