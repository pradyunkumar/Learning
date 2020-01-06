package pradyunjava;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        //adds this String in index position 1
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        //removes index position 4
//        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList){
        //iterator is another tool to go through all entries of list
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){ //while LinkedList is pointing to something, next place
            System.out.println("Now visiting " + i.next());
            //i.next() prints out the current value but also move on to next
            //hasNext() is "is there another entry?"
            //next() is move to the next entry
        }
        System.out.println("========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        //list iterator is not automatically pointing to first entry, we need to put .next()
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            //compareTo() method compares Strings Alphabetically, returns int
            //if comparison = 0, Strings are equal,matching
            if(comparison == 0){
                //equal, do not add
                System.out.println(newCity + " is already included as a destination.");
                return false;
            } else if(comparison > 0){
                //newCity should appear before this one
                //Brisbane --> Adelaide
                //already used .next() so we are on next entry, we need to go back
                stringListIterator.previous();  //go back to previous entry
                stringListIterator.add(newCity);
                return true;
            } else {
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingforward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){   //isEmpty checks if empty
            System.out.println("No cites in the itenerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit){
            byte action = scanner.nextByte();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Vacation is over! ");
                    quit = true;
                    break;
                case 1:
                    if(!goingforward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingforward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached end of list.");
                        goingforward = false;
                    }
                    break;
                case 2:
                    if(goingforward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingforward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at start of list.");
                        goingforward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \npress ");
        System.out.println("0 - to quit\n " +
                "1 - go to next city\n " +
                "2 - go to previous city\n " +
                "3 - print menu ");
    }
}
