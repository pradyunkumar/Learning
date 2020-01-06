package pradyunjava;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> Customers;

    public Branch(String name) {
        this.name = name;
        this.Customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public Customer isCustomer(String name){
        for(int i = 0; i<Customers.size(); i++){
            if(Customers.get(i).getName().equals(name)){
                return Customers.get(i);
            }
        }
        return null;
    }

    public void doTransaction(Customer customer, Double amount){
        if(isCustomer(customer.getName()) != null){
            customer.doTransaction(amount);
        } else {
            System.out.println(customer.getName() + " not found in branch ");
        }
    }

    public void addCustomer(Customer customer){
        if(isCustomer(customer.getName()) != null){
            System.out.println(customer.getName() + " already exists.");
        } else {
            Customers.add(Customer.addCustomer(customer.getName(), customer.getInitialBalance()));
            System.out.println(customer.getName() + " is a new customer!");
        }
    }

    public static Branch addBranch(String name){
        return new Branch(name);
    }

    public void printCustomers(){
        System.out.println("Customers are: ");
        for(int i = 0; i < Customers.size(); i++){
            System.out.print(Customers.get(i).getName());
        }
        for(int i = 0; i < Customers.size(); i++){
            System.out.println(Customers.get(i).getName() + "'s Transactions:");
            Customers.get(i).printTransactions();
            System.out.println();
        }
    }
}
