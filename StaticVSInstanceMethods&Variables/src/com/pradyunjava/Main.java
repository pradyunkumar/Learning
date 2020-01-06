package com.pradyunjava;

public class Main {
    /*  static methods are declared using a static modifier
    *       static methods can't access instance methods and instance variables directly
    *       used for operations that don't require data from an instance of class(this)
    *       this keyword is current instance of a class
    *       if method does not use instance variables, the method should be declared static
    *       main is static method
    *
    *   instance methods belong to an instance of a class
    *       to use instance method we have to instantiate the class using the "new" keyword
    *       instance methods can access other instance & static methods and variables directly
    *
    *   if a method uses fields or instance methods, it should be instance method
    *   if not, it should be static
    *
    *
    *   static variables are declared using keyword "static"
    *   static variables aka static member variables
    *   every instance of that class shares that same static variable
    *   if changes are made to that variable, all instances of that class will change
    *   not used too often
    *       when used with scanner, the scanner is a static variable
    *       all static methods can access that class directly
    *
    *   instance variable don't use static
    *   aka fields or member variables
    *   belong to an instance of a class
    *   instances can their own copy of an instance variable
    *   every instance can have a different value or state
    *   represent the state of an instance of a class
    *
    */
    public static void main(String[] args) {
	    Dog Rex = new Dog("Rex");
	    Dog Fluffy = new Dog("fluffy");
	    Rex.printName();
	    Fluffy.printName();
	    //both print statement print fluffy because when the static variable name changed,
        //all instances of that variable also changed
    }
}

