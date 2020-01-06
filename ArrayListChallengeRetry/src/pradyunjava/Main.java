package pradyunjava;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("124");

    public static void main(String[] args) {
        startPhone();
        boolean quit = false;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
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
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }

    private static void addContact(){
        System.out.print("Please enter the contact name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter contact phone #: ");
        String phonenum = scanner.nextLine();

        Contact contact = Contact.createContact(name, phonenum);
        if(mobilePhone.addNewContact(contact)){
            System.out.println("New Contact added: name = " +
                    name + " and phone = " + phonenum);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newname = scanner.nextLine();
        if(name.equals(newname)){
            System.out.println("Please enter a different name");
        }
        System.out.println("Enter new contact phone number: ");
        String newnumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newname, newnumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact((existingContactRecord))){
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }

    }
    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName()
                + " phone number is " + existingContactRecord.getPhonenumber());
        if (mobilePhone.removeContact((existingContactRecord))) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

}
