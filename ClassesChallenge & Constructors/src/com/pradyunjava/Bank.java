package com.pradyunjava;

public class Bank {

    private String number;
    private double balance = 0.00;
    private String CustomerName;
    private String email;
    private String PhoneNumber;

    public Bank(){  //already created by java, CONSTRUCTOR
        this("00000", 0.00, "default name",
                "Default address", "default phone#");
        //calling another constructor within a constructor
        //if no parameters given these default parameters will be assigned
        //this must be the first statement of the constuctor body
    }

    public Bank(String number, double balance, String CustomerName,
                String email, String PhoneNumber){
        //constructor gets rid of need for setters
        this.number = number;
        this.balance = balance;
        this.CustomerName = CustomerName;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }

    public Bank(String number, double balance, String CustomerName) {
        this(number, balance, CustomerName, "bruh@urmum", "382913" );
        this.number = number;
        this.balance = balance;
        this.CustomerName = CustomerName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    public void setEmail(String email) {

        this.email = email;
    }

    public String getNumber(){
        return number;
    }
    public double getBalance(){                //setter for field "balance"
        return balance;
    }
    public String getCustomerName(){                //setter for field "CustomerName"
        return CustomerName;
    }
    public String getEmail(){                //setter for field "email"
        return email;
    }
    public String getPhoneNumber(){                //setter for field "PhoneNumber"
        return PhoneNumber;
    }

    public void depositMoney(double money){
        this.balance += money;
        System.out.println("The new balance is $" + String.format("%2f",balance));
    }

    public void withdrawMoney(double money){
        if(money > this.balance){
            System.out.println("Deposit too big, only $" +
                    String.format("%2f",balance) + " available");
        } else {
            balance -= money;
            System.out.println("The new balance is $" + String.format("%2f",balance));
        }
    }

    public void contact(){
        if(this.CustomerName == null || this.email == null
                || this.PhoneNumber == null){
            System.out.println("Please enter all contacts");
        } else {
            System.out.println(this.CustomerName + ", " + this.email + ", "
                    + this.PhoneNumber);
        }
    }


}
