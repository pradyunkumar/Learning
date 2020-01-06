package pradyunjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomStringChooser {
    private List<String> wordList;

    public RandomStringChooser(String[] wordArray){
        wordList = new ArrayList<String>(Arrays.asList(wordArray));
    }
    public String getNext(){
        if(wordList.size() > 0)
            return wordList.remove((int)(Math.random()*wordList.size()));
        else
            return "NONE";
    }

}

class RandomLetterChooser extends RandomStringChooser{
    public RandomLetterChooser(String str){
        super(getSingleLetters(str));
    }
    public static String[] getSingleLetters(String str){
        String[] array = str.split("");
        return array;
    }
}
