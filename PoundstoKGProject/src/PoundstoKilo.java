public class PoundstoKilo {

    public static void main(String[] args){

        float pounds = 1.5f;
        double conversion = 0.453_592_37;   //underscores can be put to make clearer
        double newtotal = pounds * conversion;
        System.out.println(newtotal);
    }
}
