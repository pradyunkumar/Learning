import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //width of 16 (2 bytes)
        char thechar = 'A';     //put apostrophes for char
        char theit = '\u00AE';
        //for unicode add \u and then the unicode from the website
        System.out.println(theit);

        boolean theboolean = true;  //true or false

    }
}
