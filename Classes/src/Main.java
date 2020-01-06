public class Main {

    public static void main(String[] args) {
        // software objects store their state in fields, in variables
        //class is the template to describe an object
        //class can allow you to make something more powerful than a primitive type

        Car porsche = new Car();    //created a new data type porsche of class Car
        Car holden = new Car();     //another object created from class car
        //System.out.println("Model is " + porsche.getModel());
        //prints null which is the internal default state of a class or String
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
