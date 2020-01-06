package pradyunjava;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    }



    /**
     * @param word
     *  for each letter in word
     *      if letter is A and following letter is not A
     *          swap
     *          i += 1
     * @return
     */
    public static String scrambleWord(String word){
        String scrambled = word;
        for(int i = 0; i < scrambled.length()-1; i++){
            if(scrambled.substring(i, i+1).equals("A")
                    && !scrambled.substring(i+1, i+2).equals("A")){
                scrambled = scrambled.substring(0, i) + scrambled.substring(i+1, i+2)
                        + scrambled.substring(i, i+1) + scrambled.substring(i+2);
                i += 1;
            }
        }
        return scrambled;
    }

    /**
     *
     * @param wordList
     */
    public static void scrambleOrRemove(List<String> wordList){
        for(String word: wordList){
            if(!scrambleWord(word).equals(word))
                wordList.add(scrambleWord(word));
            else
                wordList.remove(word);
        }
    }
}
