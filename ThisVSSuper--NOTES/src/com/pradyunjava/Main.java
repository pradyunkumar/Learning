package com.pradyunjava;

public class Main {
    /*  super is used to acccess/call the parent class members (variables and methods
    *   this is used to call the current class member(variables & methods)
    *       this is required when there is a parameter with the same name as an instance variable
    *
    *   both can be used anywhere is a class EXCEPT static areas (static blocks or methods)
    *       if used, will lead to compile-time errors
    *
    *   this is used with constructors and setters, and sometimes getters
    *       for constructors and setters, there is a parameter with the same name
    *           so we use this to also update the field along with the parameter
    *       in getters, there aren't parameters so there is no need for a this keyword
    *
    *   super is used commonly in method overriding and extended class constructors
    *       calling same name from parent class
    *       without super, it would be a recursive call, as the method is simply calling itself
    *
    *   both this and super are know as "calls" because they look like  method class
    *   this() calls a constructor from another overloaded constructor in the same class
    *       this() can only be used as the 1st statement in a constructor
    *       used in constructor chaining, when 1 constructor calls another to reduce duplicated code
    *   super() is the only way to call a parent constructor
    *       java calls super() as a default if not added
    *           this super is always no-args meaning it calls a constructor without argument inputted by java
    *       super() must be the first statement in a constructor
    *       Abstract classes have constructors, although you can't instantiate an abstract class using "new"
    *           abstract classes are super classes, so constructors run when an instance of concrete subclasses are made
    *       Constructor can call super() or this() but not BOTH
    * */

    public static void main(String[] args) {
	// write your code here
    }
}
