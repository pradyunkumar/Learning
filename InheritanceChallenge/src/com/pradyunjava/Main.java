package com.pradyunjava;

public class Main {

    public static void main(String[] args) {
        Sedan Civic = new Sedan("black");
        Civic.setGearMode("park");
        Civic.move();
        Civic.changeSpeed(25);
        Civic.turn("left");
    }
}
