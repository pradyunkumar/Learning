package pradyunjava;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double initialBalance;
    private ArrayList<Double> transactions;
    private double currentbalance = initialBalance;

    public Customer(String name, double initialBalance) {
        this.name = name;
        this.initialBalance = initialBalance;
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public static Customer addCustomer(String name, double initialBalance){
        return new Customer(name, initialBalance);
    }

    public void doTransaction(Double amount){
        transactions.add(amount);
        currentbalance = initialBalance;
        currentbalance += amount;
        if(amount < 0){
            System.out.println("$" + -1*amount + " withdrawn ---> $" + currentbalance);
        } else {
            System.out.println("$" + amount + " deposited ---> $" + currentbalance);
        }
        initialBalance = currentbalance;
    }

    public void printTransactions(){
        double currentbalance = initialBalance;
        System.out.println("Initial Balance is $" + initialBalance);
        if(transactions.size() == 0){
            System.out.println("No transactions recorded");
        }
        for(int i = 0; i<transactions.size(); i++){
            currentbalance += transactions.get(i);
            if(transactions.get(i) > 0){
                System.out.println("Deposited $" + transactions.get(i) + ", total balance is $" + currentbalance);
            } else {
                System.out.println("Withdrew $" + -1*transactions.get(i) + ", total balance is $" + currentbalance);
            }
        }
    }
}
