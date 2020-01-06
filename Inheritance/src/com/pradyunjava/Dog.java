package com.pradyunjava;

public class Dog extends Animal{

    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int legs,
               int eyes, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);    //fill in some values
        //super is to call the constructor of the class we are extending from
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){    //only inside dog class
        System.out.println("Dog.chew() is called");
    }

    @Override   //reminding this is override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();    //super calling method from Animal Class
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        super.move(5);  //only use method in super class
        //don't use super here if you want to create a new method for dog moving
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void run(){
        System.out.println("Dog.run is called");
        move(10);
        //method finds move in this method, and if not there, goes to super
    }
}
