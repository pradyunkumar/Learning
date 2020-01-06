package pradyunjava;

public class Main {
    /** public, private, protected restrict scope
     *  when using variables, java will first look in smaller code blocks then expand
     *
     *
     * */
    public static void main(String[] args) {
	    String var4 = "this is private to main()";
	    ScopeCheck scopeInstance = new ScopeCheck();
	    scopeInstance.useInner();
	    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("scope instance var1 is " + scopeInstance.getVar1());
//        System.out.println(var4);
//
//        scopeInstance.timesTwo();
//        System.out.println();
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();

    }
}
