package com.pradyunjava;

public class Main {
    /*  Method Overloading is providing 2+ methods with the same name but different parameters
    *       reuse of same name, and preventing duplicated code
    *       Overloading is referred as Compile Time Polymorphism
    *           doesn't actually have to do with polymorphism
    *           compiler decided which method to be called based on method name, return type, and arg list
    *       can overload static and instance methods
    *       happens inside inside a single class
    *
    *       overriding means defining a method in a child class that already exists in parent class
    *           same name + args
    *           child gets all methods defined in parent class
    *           aka Runtime Polymorphism & Dynamic Method Dispatch
    *               the method going to be called(parent/child) will be decided at runtime
    *           when overriding, put @Override above method for compiler to read
    *           only instance methods can be overridden, not static
    *           methods can be overridden if they:
    *               have the same name and args
    *               return type can be a subclass of the return type in the parent class
    *               can't have lower access modifier
    *                   parent can't be protected and child be private
    *                   only inherited methods can be overridden
    *                       overriding can only happen in child classes
    *                   costructors and private methods can't be overridden
    *                   final cannot be overridden
    *           subclass can use super.methodName(0 to call the superclass version of an overridden method
    *       when return types are different, it is known as a covariant return type
    */
    void main(String[] oof) {
	// write your code here

    }
}
