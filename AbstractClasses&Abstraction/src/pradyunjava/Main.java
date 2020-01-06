package pradyunjava;

public class Main {
    /** Interfaces are abstract meaning they don't specify implemetnation
     *      left to classes implementing interface
     *      directs what needs to be done not how it's done
     *  Abstraction is using the fundamental interface
     *      i.e ArrayList --> List
     *      gives more options for implementing classes
     *      Abstract Classes provide the method declarations but not implementation
     *          essentially a normal class (w/ fields etc.) but no implementation
     *          by calling method declaration abstract, we are forcing them to be overriden
     *      you cannot instantiate a class that is abstract
     *
     *  Use interfaces to declare methods that don't apply to all objects
     *  But if the method is applied to all, put it in the abstract class
     *
     *  Abstract Classes can have Member Variables that can be inherited
     *  Interface Variables Are public static final
     *      cannot have constructors
     *      automatically public methods
     *      all code is abstract
     *  Abstract Classes
     *      methods can retain any scope
     *      can implement methods and abstract methods
     * */

    public static void main(String[] args) {
        Dog dog = new Dog("Bruh");
        dog.breath();
        dog.eat();

        Bird parrot = new Parrot("Paco");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Bird penguin = new Penguin("Noice");
        penguin.fly();
    }
}
