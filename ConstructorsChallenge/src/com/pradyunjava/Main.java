package com.pradyunjava;

public class Main {

    public static void main(String[] args) {
        Vip theVip = new Vip("Tim", 2344.54, "@yahoo");

        System.out.println(theVip.getName());
        System.out.println(theVip.getCreditLimit());
        System.out.println(theVip.getEmail());
    }
}
