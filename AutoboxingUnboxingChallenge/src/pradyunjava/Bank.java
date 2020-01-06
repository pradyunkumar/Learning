package pradyunjava;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> Branches;

    public Bank(String name) {
        this.name = name;
        this.Branches = new ArrayList<Branch>();
    }

    public Branch branchExists(String name){
        for(int i = 0; i<Branches.size(); i++){
            if(Branches.get(i).getName().equals(name)){
                return Branches.get(i);
            }
        }
        return null;
    }
    public void addBranch(String name){
        Branch abranch = branchExists(name);
        if(abranch != null){
            System.out.println(name + " already exists.");
        } else {
            Branches.add(Branch.addBranch(name));
            System.out.println(name + " has been successfully added.");
        }
    }

    public void addCustomer(Branch branch, Customer customer){
        if(branchExists(branch.getName()) != null){
            if(branch.isCustomer(customer.getName()) != null){
                System.out.println(customer.getName() + " already in " + branch.getName());
            } else {
                branch.addCustomer(customer);
            }
        } else {
            System.out.println(branch.getName() + " does not exist.");
        }
    }

    public void doTransaction(Branch branch, Customer customer, Double amount){
        if(branchExists(branch.getName()) != null){
            if(branch.isCustomer(customer.getName()) != null){
                branch.doTransaction(customer, amount);
            } else {
                System.out.println(customer.getName() + " does not exist in " + branch.getName());
            }
        } else {
            System.out.println(branch.getName() + " does not exist.");
        }
    }

    public void printCustomers(Branch branch){
        if(branchExists(branch.getName()) != null){
            branch.printCustomers();
        } else {
            System.out.println(branch.getName() + " does not exist.");
        }
    }

}
