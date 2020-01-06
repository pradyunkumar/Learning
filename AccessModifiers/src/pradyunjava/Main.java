package pradyunjava;

public class Main {
    /** Top Level Classes cannot be declared private
     *      enum, interfaces, classes
     *  public means object is visible everywhere whether in same package or imported
     *  package-private means only visible in package
     *      don't specify a public/private/protected
     *  private is only visible in current class declared(also inner)
     *      NOT subclasses of this class
     *  protected is like package-private
     *      but subclasses extend this visibility even if they are in other packages
     *
     *
     */

    public static void main(String[] args) {
	    Account myAccount = new Account("Mine");
	    myAccount.deposit(1000);
	    myAccount.withdraw(500);
	    myAccount.withdraw(-200);
	    myAccount.deposit(-20);
	    myAccount.calculateBalance();
        System.out.println("Balance on account is " + myAccount.getBalance());
    }
}
