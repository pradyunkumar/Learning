import java.util.ArrayList;

public class WordPairList {
    class WordPair{
        String first;
        String second;

        public WordPair(String first, String second){
            this.first = first;
            this.second = second;
        }

        public String getFirst() {
            return first;
        }

        public String getSecond() {
            return second;
        }
    }

    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words){
        allPairs = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j <words.length; j++){
                if(j > i){
                    allPairs.add(new WordPair(words[i],words[j]));
                }
            }
        }
    }

    public int numMatches(){
        int matches = 0;
        for(WordPair pair : allPairs){
            if(pair.getFirst().equals(pair.getSecond())){
                matches++;
            }
        }
        return matches;
    }
}
