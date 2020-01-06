package com.pradyunjava;

public class Sedan extends Car{

    private String fuel;

    public Sedan(String color) {
        super("Sport/Eco",  5, 10000, color,
                "medium",  4, 25);
        this.fuel = fuel;
    }

    public String getFuel(){
        return fuel;
    }

    public void RunsOn(){
        if(fuel == null){
            System.out.println("Please entire fuel type");
        }else if(fuel.equals("electric")){
            System.out.println("This care is electric");
        } else{
            System.out.println("This car runs on " + fuel);
        }
    }
}
