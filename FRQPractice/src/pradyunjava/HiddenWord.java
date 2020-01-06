package pradyunjava;

public class HiddenWord {
    String word;

    public HiddenWord(String actualWord){
        word = actualWord;
    }

    public static void main(String[] args){
        HiddenWord word = new HiddenWord("DOG");
        System.out.println(word.getHint("GOG"));
    }

    /**
     *
     * @param guess
     * initialize hint
     * split String into String[]
     * split word into String[]
     * nested for loop
     *  if guess[i] == word[j]
     *      if i == j
     *          add guess[i]
     *      else
     *          add +
     *  else
     *      add *
     *
     * @return
     */
    public String getHint(String guess){
        String hint = "";
        for(int i = 0; i < guess.length(); i++){
            if(guess.substring(i, i+1).equals(word.substring(i, i+1))){
                hint += guess.substring(i, i+1);
            } else if(word.contains(guess.substring(i, i+1))){
                hint += "+";
            } else {
                hint += "*";
            }
        }
        return hint;
    }
}
