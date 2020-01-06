package pradyunjava;

public class Main {
    /** Interface specifies methods that a particular class implements
     *      abstract; no code for methods, only method names and param
     *      interface provides a common behavior for many classes to use
     *          implement this interface
     *      interface declares methods and they will not change
     *          code wont break in class
     *      generic to start Interface's names with letter I
     *
     */

    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(12234);
        myPhone.powerOn();
        myPhone.callPhone(12234);
        myPhone.answer();

        myPhone = new MobilePhone(12923);
        myPhone.powerOn();
        myPhone.callPhone(12923);
        myPhone.answer();
    }
}
