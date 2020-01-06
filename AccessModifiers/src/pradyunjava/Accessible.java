package pradyunjava;

/**
 * What is the Visibility of:
 *
 * 1. the Accessible inferface: package-private
 * 2. the int variable SOME_CONSTANT: public
 * 3. methodA: public to all implementers
 * 4. methodB and methodC: public to all implementers
 *
 *
 */

interface Accessible {
    int SOME_CONSTANT = 100;
    //all interface variables are public static final
    public void methodA();
    void methodB();
    boolean methodC();
    //all methods in interfaces are automatically public
}
