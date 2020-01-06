package pradyunjava;

import java.util.Scanner;

// You job is to create a simple banking application.
// --There should be a Bank class
// --It should have an arraylist of Branches
// --Each Branch should have an arraylist of Customers
// --The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// --Name, and the ArrayList of doubles.
// Branch:
// --Need to be able to add a new customer and initial transaction amount.
// --Also needs to add additional transactions for that customer/branch
// Bank:
// --Add a new branch
// --Add a customer to that branch with initial transaction
// --Add a transaction for an existing customer for that branch
// --Show a list of customers for a particular branch and optionally a list
// --of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Bank of Pradyun");
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.print("Please enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    doTransaction();
                    break;
                case 4:
                    addBranch();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions(){
        System.out.println("\nPress: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the customers and transactions.");
        System.out.println("\t 2 - To add customers.");
        System.out.println("\t 3 - To do transactions.");
        System.out.println("\t 4 - To add a branch.");
        System.out.println("\t 5 - To quit the application.");
    }

    private static void printCustomers(){
        System.out.print("Please enter the branch name: ");
        String branchname = scanner.nextLine();
        scanner.nextLine();

        Branch branch = bank.branchExists(branchname);
        if(branch != null) {
            bank.printCustomers(branch);
        } else {
            System.out.println(branchname + " does not exist.");
        }
    }

    private static void addBranch(){
        System.out.print("Please enter branch name: ");
        String branchname = scanner.nextLine();
        scanner.nextLine();
        bank.addBranch(branchname);
    }

    private static void addCustomer(){
        System.out.print("Please enter branch name: ");
        String branchname = scanner.nextLine();
        scanner.nextLine();

        Branch branch = bank.branchExists(branchname);
        if(branch != null) {
            System.out.print("Please enter customer name: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            if(branch.isCustomer(name) != null) {
                System.out.println(name + " already exists.");
            } else {
                System.out.println("Please enter " + name + "'s initial bank balance: ");
                Double balance = scanner.nextDouble();
                bank.addCustomer(branch, new Customer(name, balance));
            }
        } else {
            System.out.println(branchname + " does not exist.");
        }
    }

    private static void doTransaction(){
        System.out.print("Please enter branch name: ");
        String branchname = scanner.nextLine();
        scanner.nextLine();
        Branch branch = bank.branchExists(branchname);
        if(branch != null) {
            System.out.print("Please enter customer name: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            Customer customer = branch.isCustomer(name);
            if(customer != null) {
                System.out.print("Please enter transaction: (>0 - deposit, <0 - withdrawal)");
                Double amount = scanner.nextDouble();
                bank.doTransaction(branch, customer, amount);
            } else {
                System.out.println(name + " does not exist in " + branchname);
            }
        } else {
            System.out.println(branchname + " does not exist.");
        }
    }
}
