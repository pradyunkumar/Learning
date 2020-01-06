package com.pradyunjava;

public class Main {

    public static void main(String[] args) {
        Bank customer = new Bank(/*"10000", 200,
                "Pradyun", "p@gmail.com","510"*/); //calls constuctor automatically
        //put the setter in as parameters into the object declaration to set values

        System.out.println();
        System.out.println("The customer's name is " + customer.getCustomerName());
        System.out.println("The customer's email is " + customer.getEmail());
        System.out.println("The customer's phone # is " + customer.getPhoneNumber());
        customer.contact();
        customer.depositMoney(100);
        customer.withdrawMoney(50000);


    }
}
