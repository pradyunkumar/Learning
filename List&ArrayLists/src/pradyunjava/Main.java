package pradyunjava;

import java.util.Scanner;


public class Main {
    /* lists are ordered collections, aka a sequence
    *       arrayList is a resizable array, internally
    *       as elements are added to an array list, resizing happens automatically
    *       inherits from list class
    *       automatically makes new spaces
    */
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        byte choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextByte();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchforItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    private static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item in the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void addItem(){
        System.out.print("Please enter the grocery Item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacemement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo -1, newItem);
    }

    private static void removeItem(){
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    private static void searchforItem(){
        System.out.print("Enter item to search for: ");
        String searchitem = scanner.nextLine();
        if(groceryList.findItem(searchitem) != null){
            System.out.println("Found " + searchitem);
        } else {
            System.out.println(searchitem + " is not there");
        }
    }

}
