package pradyunjava;

public class Main {
    /*Encapsulations allows you to restrict access to certain components from the objects being created
    *   protect members of class from external access
    *       stopping classes outside from access the inner parts of class
    *       gives more control to change things without disturbing things elsewhere
    *
    */
    public static void main(String[] args) {
//
//        Player player = new Player();
//        //default constructor with no parameters has been created
//
//        player.name = "tim";
//        /* Another issue with this approach is that any change in other classes means that
//            the change needs to also be changed in the main         */
//        player.health = 20;
//        /* Also the programmer might forget to set these values(usually taken care of by
//            the constructors        */
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        /*  A problem with using public keyword for access of fields is that the main method
//            or calling method can change the fields from outside, not desired         */
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Prad", 50, "sword");
        System.out.println("Intital health is " + player.getHitpoints());
    }
}
