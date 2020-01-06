package com.pradyunjava;

public class Vip {

    private String name;
    private double creditLimit;
    private String email;

    public Vip(){
        this("Tim", 12000, "html@java.com");
    }

    public Vip(String name, String email){
        this(name, 1500.00, email);
    }

    public Vip(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
