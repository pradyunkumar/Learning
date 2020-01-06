package pradyunjava;

public class Main {
    /**
     *  Internally Java allocates 4 bytes of memory for each int in an array
     *      Address is 4i + 100, i = index
     *      double uses 8 bytes of memory for each place
     *  to add this element all values after index 1 are pushed down one
     *  same goes with reverse
     *      a lot of work on computer = slow
     *  Linked-List is an alternative to arrays
     *      stores link to next item in list as well as item
     *      each value holds its own value and its link to the next one
     *      Example: if you wanted to add item in list, you take the pointer of
     *          previous item, and point it to the new item, then you take the
     *          new item's pointer and point it to next item
     *      Linked Lists are great when you are constantly adding or taking away items
     *      Linked Lists can scan in both directions because its a double linked list
    *
    *
    * */

    public static void main(String[] args) {
//        Customer customer = new Customer("Pradyun", 54.95);
//        Customer anotherCustomer;
//        anotherCustomer = customer;
//        anotherCustomer.setBalance(12.18);
//        System.out.println("Balance for customer " + customer.getName() + " is " +
//            customer.getBalance());
//        //prints changed value because the pointer of second class changed changing first
//
//        ArrayList<Integer> intList = new ArrayList<Integer>();
//        intList.add(1);
//        intList.add(4);
//        intList.add(5);
//
//        for(int i = 0; i < intList.size(); i++){
//            System.out.println(i + ": " + intList.get(i));
//        }
//        intList.add(1, 2);
//        for(int i = 0; i < intList.size(); i++){
//            System.out.println(i + ": " + intList.get(i));
//        }

    }
}
