package com.pradyunjava;

public class Main {
/*      Example: building a house
                a CLASS is th blueprint for the house
                using this blueprint we can make many houses

                each house you build (INSTANTIATE using NEW operator) is an OBJECT or INSTANCE
                the house built has an address, the place of this house, is a REFERENCE
                    you can copy the reference, but there is still one house
                    you can pass refereneces as parameters to constructors and methods

 */
    public static void main(String[] args){
        House blueHouse = new House("blue");
        //creates a new object of house class, bluehouse (variable)
        //bluehouse is a reference to the object in memory

        House anotherHouse = blueHouse;
        //creates another reference to the same object in memory
        //2 addresses written down

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        //both referencing the same object so they will have the same output

        anotherHouse.setColor("yellow");    //calling method setColor to change color
        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        //2 references point to same object
        //if the color is changed in one, the references still point at the same one

        House greenHouse = new House("green");
        //2nd object in memory, but a 3rd reference
        //2 references to a blue house, 1 to a green one
        anotherHouse = greenHouse;
        //shift one reference from bluehouse to greenhouse

        System.out.println(blueHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(greenHouse.getColor());
        //no way to access object directly, only through a reference
    }

}
