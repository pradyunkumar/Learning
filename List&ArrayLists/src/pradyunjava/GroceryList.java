package pradyunjava;

import java.util.ArrayList;
//asks for type of arrayList in <E>

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
        //adds item into arrayList
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in list");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
            //size methods calls size of the list, number of elements in list
            //get method calls to retrieve element through position
        }
    }

    private void modifyGroceryItem(String newItem){
        int position = findItemm(newItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        //sets object in this position using set method
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(theItem + " has been removed");
    }

    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        //contains method returns true if item exists
        int position = groceryList.indexOf(searchItem);
        //searches array list for item passed and gives off position
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }

    public int findItemm(String searchItem){
        return groceryList.indexOf(searchItem);
    }

}
