package com.pradyunjava;

public class Dog {

    private /*static*/ String name;

    public Dog(String name){
        this.name = name;   //call class with static
    }

    public void printName(){
        System.out.println("name is " + name);
    }
}
