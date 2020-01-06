package com.pradyunjava;

public class Car extends Vehicle {

    private String trunkSize;
    private int doors;
    private String gearMode;
    private double mileage;

    public Car(){}

    public Car(String engine, int passengerCapacity, int weight,
               String color, String trunkSize, int doors, double mileage) {
        super(engine, "aluminum-steel", passengerCapacity, weight, 10, color, 10);
        this.trunkSize = trunkSize;
        this.doors = doors;
        this.mileage = mileage;
    }

    public void setGearMode(String gearMode){
        this.gearMode = gearMode;
    }

    public String getTrunkSize() {
        return trunkSize;
    }

    public int getDoors() {
        return doors;
    }



    public void steeringwheel(String direction){
        System.out.println("Car steering wheel is directing" + direction);
    }

    @Override
    public void turn(String direction){
        steeringwheel(direction);
        super.turn(direction);
    }

    public void changeGears(){
        System.out.println("The Car has changed gears to " + gearMode);
        if(gearMode.equals("park")){
            System.out.println("The car is parked");
        }
        else if(gearMode.equals("reverse")){
            System.out.println("Car is backing up");
        } else{
            System.out.println("Car is going forward");
        }
    }

    @Override
    public void move(){
        if(gearMode == null){
            System.out.println("Please enter gear mode");
        } else {
            steeringwheel("forward");
            changeGears();
            if(gearMode != "park") {
                super.move();
            }
        }
    }

    public void changeGas(String amount){
        if(amount.equals("less")){
            System.out.println("Release the gas");
        }else if(amount.equals("more")){
            System.out.println("Push the gas");
        }
    }

    @Override
    public void changeSpeed(int newSpeed){
        if(newSpeed < 0){
            changeGas("less");
        }else {
            changeGas("more");
        }
        super.changeSpeed(newSpeed);
    }
}
