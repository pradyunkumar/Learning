package pradyunjava;

import java.util.List;

public class StringFormatter {

    public static int totalLetters(List<String> wordList){
        int sum = 0;
        for(String word: wordList){
            sum += word.length();
        }
        return sum;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen){
        return ((formattedLen - totalLetters(wordList))/(wordList.size()-1));
    }

    public static int leftoverSpaces(List<String> wordList, int formattedLen){
        return ((formattedLen - totalLetters(wordList))%(wordList.size()-1));
    }
    public static String format(List<String> wordList, int formattedLen){
        int spaces = basicGapWidth(wordList, formattedLen);
        int leftoverSpaces = leftoverSpaces(wordList, formattedLen);
        String phrase = "";
        for(String word: wordList){
            phrase += word;
            for (int i = 0; i < spaces; i++){
                phrase += " ";
            }
            if(leftoverSpaces > 0){
                phrase += " ";
                leftoverSpaces--;
            }
            //NEEDED TO USE A FOR LOOP BECAUSE NO SPACES SHOULD BE ADDED AFTER LAST WORD
        }
        return phrase;
    }
}
