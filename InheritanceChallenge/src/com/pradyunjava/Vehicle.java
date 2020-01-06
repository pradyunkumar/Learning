package com.pradyunjava;

public class Vehicle {

    private String engine;
    private String frame;
    private int passengerCapacity;
    private int weight;
    private int size;
    private String color;
    private int speed;

    public Vehicle(){
        this("Basic", "aluminum", 4,
                10000, 8, "black", 20);
    }

    public Vehicle(String engine, String frame, int passengerCapacity, int weight,
                   int size, String color, int speed){
        this.engine = engine;
        this.frame = frame;
        this.passengerCapacity = passengerCapacity;
        this.weight = weight;
        this.size = size;
        this.color = color;
        this.speed = speed;
    }

    public String getEngine(){
        return engine;
    }
    public String getFrame(){
        return frame;
    }
    public int getPassengerCapacity(){
        return passengerCapacity;
    }
    public int getWeight(){
        return weight;
    }
    public int getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }

    public void turn(String direction){
        System.out.println("Vehicle is turning " + direction);
    }

    public void turnonEngines(){
        System.out.println("Vehicle engines have turned on!");
    }
    public void move(){
        turnonEngines();
        System.out.println("Vehicle is moving at " + getSpeed() + " mph");
    }

    public void changeSpeed(int speednew){
        speed += speednew;
        System.out.println("The new speed is " + speed);
    }
}
