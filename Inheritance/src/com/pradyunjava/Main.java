package com.pradyunjava;

public class Main {

    public static void main(String[] args) {
        /*  Object Oriented Programming allows
            to create to inherit commonly used state of behavior from other classes

            Example: thinking of an animal, certain behaviors are shared across all animals
                size and weight in common, legs or eyes different
         */
        //new means that you are making a new dat type of class Animal called "animal"
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Max", 8, 20, 2,
                4, 1, 10, "silky");
        //dog.eat();  //able to use method eat which is in eat method in animal class (extended)
        System.out.println();
        dog.walk();
        //dog.run();
    }
}
